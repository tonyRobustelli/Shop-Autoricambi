public class AmministratoreProdotti_Control extends HttpServlet{
    
        public AmministratoreProdotti_Control() {
        super();
    }
    
    
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
        
        // usata per inserire un nuovo prodotto, uso InsProdotto
        PrintWriter out = response.getWriter();
        Prodotto prod=new Prodotto();
        Foto foto=new Foto();
        prod.setCod_pezzo(request.getParameter("cod_pez"));
        System.out.println("Prodotto   "+prod.getCod_pezzo());
        prod.setMarchio(request.getParameter("marchio"));
        prod.setModello(request.getParameter("modello"));
        prod.setPrezzo(Float.parseFloat(request.getParameter("prezzo")));
        if(request.getParameter("offerta")!=null)
            prod.setOfferta(true);
        else
            prod.setOfferta(false);
        System.out.println("offerta  "+prod.isOfferta());
        if (prod.isOfferta())
            prod.setPrezzo_scontato(Float.parseFloat(request.getParameter("prescont")));
        prod.setDescrizione((request.getParameter("descri")));
        prod.setQuantita(Integer.parseInt((request.getParameter("quanti"))));
        
        Prodotto_Manager model=new Prodotto_Manager();
        try {
            int controllo=model.SalvaProdotto(prod,foto);
            if(controllo==1)
            {
                //AGGIORNA LA QUANTITA DEL PRODOTTO
                /*out.println("<script>");
                out.println("alert('Quantit� aggiornata con successo');");
                out.println("location:='prodotti.jsp';");
                out.println("</script>");*/
                response.sendRedirect("prodotti.jsp");
            }
            else
                if(controllo==2)
                {
                    System.out.println("Prodotto aggiunto");
                    /*out.println("<script>");
                    out.println("alert('Prodotto aggiunto con successo');");
                    out.println("location:='prodotti.jsp';");
                    out.println("</script>");*/
                    response.sendRedirect("prodotti.jsp");
                }
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        doGet(request,response);
    }
    
}
