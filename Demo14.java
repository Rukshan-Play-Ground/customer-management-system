void main (){
    final String [][] CUSTOMER = {
            { "1","2","3","4" } ,
            { "Kasun" , "Nuwan" , "Ruwan" , "Supun" } ,
            { "077-1234565" , "071-1234565" , "075-1234565" , "041-1234565"} ,
            { "034-1234565" , "-" , null , "073-1234565" }
    };

    final String LINE = STR."+\{"-".repeat(12)}+\{"-"
            .repeat(12)}+\{"-".repeat(12)}+\{"-".repeat(12)}";

    final String HEADER ="\033[41m|%-12s|%-12s|%-12s|%-12s|\033[0m"
            .formatted("ID","NAME","CONTACT 1","CONTACT 2" );

    final String ROW = "|%-12s|%-12s|%-12s|%-12s|\n";

    System.out.println("\t\t\t\033[44mCUSTOMER DETAILS\033[0m");
    System.out.println(LINE);
    System.out.println(HEADER);
    System.out.println(LINE);


    for (int i = 0; i < CUSTOMER[0].length; i++) {
        String id = CUSTOMER[0][i];
        String name = CUSTOMER[1][i];
        String con1 = CUSTOMER[2][i];
        String con2 = CUSTOMER[3][i];

        System.out.printf(ROW, getId(id), getName(name), getCon1(con1), getCon2(con2));
    }

    System.out.println(LINE);
}

static String getId(String id) {
    return "C-%03d".formatted(Integer.parseInt(id));
}

static String getName(String name) {
    return name;
}

static String getCon1(String con) {
    return con != null && !con.equals("-") ? con : "-";
}

static String getCon2(String con2) {
    return con2 != null && !con2.equals("-") ? con2 : "-";
}