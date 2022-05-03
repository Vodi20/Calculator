# Calculator

### Function Mapping:
  
    public static final String PLUS = "+";                                          //const variablen immer in caps lock
    public static final String MINUS = "-";
    public static final String MULTIPLY = "*";
    public static final String DIVIDE = "/";

    public static final Map<String, BiFunction<Float, Float, Float>> OPERATIONS =   //mapt von den Rechenoperationen direkt zu den Berechnungen
            new HashMap<>() {{
                put(Calculate.PLUS, (x,y) -> x+y);
                put(Calculate.MINUS, (x,y) -> x-y);
                put(Calculate.MULTIPLY, (x,y) -> x*y);
                put(Calculate.DIVIDE, (x,y) -> x/y);
            }};
            
### IOException bei FileRead:
  Beim einlesen 
    public static String txtToString(String url) throws IOException {               // Konvertiert txtFile into string

        Path path = Paths.get(url);

        try (final BufferedReader br = Files.newBufferedReader(path)){
            final String file = br.lines().collect(Collectors.joining());
            return file;
        }
        catch(Exception e) {
            return "Fehler beim einlesen!";
        }
    }
