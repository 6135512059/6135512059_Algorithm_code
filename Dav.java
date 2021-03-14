class Dav {
//6135512059 patiparn
    static String Complement(String bit) {
        String newbitwise = "";
        
        for (int i = 0; i < bit.length(); i++) {
            // negative bit 0 -> 1
            if (bit.charAt(i) == '0')
                newbitwise += '1';
            // negative bit 1 -> 0
            else if (bit.charAt(i) == '1')
                newbitwise += '0';
        }
        return newbitwise;
    }

    static void Davison(int n) {
        // Initialing the String to 0
        String bitwise = "0";
        if (n == -1) {
            return;
        } else {
            for (int i = 0; i < n; i++) {
                bitwise += Complement(bitwise);
            }
            Davison(n - 1);
        }
        //print bitwise
        System.out.println(bitwise);

    }

    public static void main(String[] args) {
        if (args.length != 1)
            System.out.println("Usage: java Dav <number>");
        else {
            int d = Integer.parseInt(args[0]);
            Davison(d);
        }

    }
}