# Taschenrechner

functionmapping:
  damit man nicht jede Funktion einzeln Verfassen muss, kann man eine Map erstellen, welche aufgrund des eingegebenen Operators die jeweilige lambda expression           ausführt
  
        public static final String PLUS = "+"; 
        public static final String MINUS = "-";
        public static final String MULTIPLY = "*";
        public static final String DIVIDE = "/";

        public static final Map<String, BiFunction<Float, Float, Float>> OPERATIONS =  
                new HashMap<>() {{
                    put(Calculate.PLUS, (x,y) -> x+y);
                    put(Calculate.MINUS, (x,y) -> x-y);
                    put(Calculate.MULTIPLY, (x,y) -> x*y);
                    put(Calculate.DIVIDE, (x,y) -> x/y);
                }};



newBufferedRead: 

Zu beachten ist "throws IOException":
  Exception beim readen eines Files, werden benötigt, da es sein kann, dass das File unter dieser URL nicht existiert.
  
    public static String txtToString(String url) throws IOException {

            Path path = Paths.get(url);

            try (final BufferedReader br = Files.newBufferedReader(path)){
                final String file = br.lines().collect(Collectors.joining());
                return file;
            }
            catch(Exception e) {
                return "Fehler beim einlesen!";
            }
        }

