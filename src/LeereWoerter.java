public class LeereWoerter {



        //String [] tokens = s.split( " " );
        //for ( int i = 0; i < tokens.length; i++ ) {
        //String token = tokens[ i ];
        //System.out.println(token);


        public void bern(){
            String s = "Wald ist überflüssig. Auf anderen Planeten gibt es auch keine Bäume.";
            String[] wörter = s.split(" ");
            for (int i = 0; i < wörter.length; i++) {
                String wort = wörter[i];
                System.out.println(wort);

            }

        }
    }

