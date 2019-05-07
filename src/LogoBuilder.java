class LogoBuilder {
    private String backgroundSymbol = "-";
    private String logoSymbol = "*";
    private int logoSize = 0;

    /**
     * Constructs a LogoBuilder using the default background symbol(-) and logo symbol(*)
     *
     * @param logoSize is used to define the size of the logo
     */
    LogoBuilder(int logoSize) {
        if (logoSize > 2 && logoSize < 10000 && logoSize % 2 == 1) {
            this.logoSize = logoSize;
        }
    }

    /**
     * Constructs a LogoBuilder
     *
     * @param logoSize         is used to define the size of the logo
     * @param backgroundSymbol is used to define the background symbol of the logo
     * @param logoSymbol       is used to define the logo symbol of the logo
     */
    LogoBuilder(int logoSize, String backgroundSymbol, String logoSymbol) {
        if (logoSize > 2 && logoSize < 10000) {
            this.logoSize = logoSize;
            this.backgroundSymbol = backgroundSymbol;
            this.logoSymbol = logoSymbol;
        }
    }

    /**
     * Prints the logo using the given size, background symbol and logo symbol
     * Uses StringBuilder because it's better performance-wise
     */
    void printLogo() {
        if (logoSize != 0) {
            System.out.println("N = " + logoSize);
            /* I split it into 2 for loops, because it's easier to build and print it half by half.
                   Each time the loop is executed, it prints a line.
                   In the first loop i used:
                        i = 0 so i don't have to use another variable for some parts;
                        i <= logoSize / 2  so the loop continues till it reaches the middle;
                        byTwo and incremented it by two because i needed it for some parts;

                   In the second loop i used:
                        i = logoSize/2 so i don't have to use another variable for some parts;
                        i >= 0 because i changed the i;
                        byTwo and incremented it by two because i needed it for some parts;
                    */
            for (int i = 0, byTwo = 0; i <= logoSize / 2; i++, byTwo += 2) {
                StringBuilder stringLogo = new StringBuilder();
                stringLogo.append(getSymbolStringBySize(logoSize - i, backgroundSymbol))
                        .append(getSymbolStringBySize(logoSize + byTwo, logoSymbol))
                        .append(getSymbolStringBySize(logoSize - byTwo, backgroundSymbol))
                        .append(getSymbolStringBySize(logoSize + byTwo, logoSymbol))
                        .append(getSymbolStringBySize(logoSize - byTwo, backgroundSymbol))
                        .append(getSymbolStringBySize(logoSize, backgroundSymbol))
                        .append(getSymbolStringBySize(logoSize + byTwo, logoSymbol))
                        .append(getSymbolStringBySize(logoSize - byTwo, backgroundSymbol))
                        .append(getSymbolStringBySize(logoSize + byTwo, logoSymbol))
                        .append(getSymbolStringBySize(logoSize - i, backgroundSymbol));
                System.out.println(stringLogo.toString());

            }
            for (int i = logoSize / 2, byTwo = 1; i >= 0; i--, byTwo += 2) {
                StringBuilder stringLogo = new StringBuilder();
                stringLogo.append(getSymbolStringBySize(i, backgroundSymbol))
                        .append(getSymbolStringBySize(logoSize, logoSymbol))
                        .append(getSymbolStringBySize(byTwo, backgroundSymbol))
                        .append(getSymbolStringBySize(logoSize - byTwo, logoSymbol))
                        .append(getSymbolStringBySize(logoSize, logoSymbol))
                        .append(getSymbolStringBySize(byTwo, backgroundSymbol))
                        .append(getSymbolStringBySize(logoSize, logoSymbol))
                        .append(getSymbolStringBySize(i, backgroundSymbol))
                        .append(getSymbolStringBySize(i, backgroundSymbol))
                        .append(getSymbolStringBySize(logoSize, logoSymbol))
                        .append(getSymbolStringBySize(byTwo, backgroundSymbol))
                        .append(getSymbolStringBySize(logoSize - byTwo, logoSymbol))
                        .append(getSymbolStringBySize(logoSize, logoSymbol))
                        .append(getSymbolStringBySize(byTwo, backgroundSymbol))
                        .append(getSymbolStringBySize(logoSize, logoSymbol))
                        .append(getSymbolStringBySize(i, backgroundSymbol));
                System.out.println(stringLogo.toString());
            }

        } else {
            System.out.println("The size(N) doesn't meet the requirements:\n" +
                    "2 < N < 10000, N%2==1 (N should be an odd number) ");
        }

    }

    /**
     * Builds a string of a symbol repeated as many times as given.
     * Uses StringBuilder because it's better performance-wise
     *
     * @param size   The size of the string(the amount of times the symbol should be repeated)
     * @param symbol The symbol which should be used
     * @return String
     */

    private String getSymbolStringBySize(int size, String symbol) {
        StringBuilder symbolString = new StringBuilder();
        for (int i = 0; i < size; i++) symbolString.append(symbol);
        return symbolString.toString();
    }

    void setBackgroundSymbol(String backgroundSymbol) {
        this.backgroundSymbol = backgroundSymbol;
    }

    void setLogoSymbol(String logoSymbol) {
        this.logoSymbol = logoSymbol;
    }

    /**
     * Sets the logoSize to 0 if it doesn't fit the criteria
     * @param logoSize
     */
    void setLogoSize(int logoSize) {
        if (logoSize > 2 && logoSize < 10000 && logoSize % 2 == 1) {
            this.logoSize = logoSize;
        }else{
            this.logoSize=0;
        }
    }
}
