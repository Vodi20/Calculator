# Taschenrechner

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
