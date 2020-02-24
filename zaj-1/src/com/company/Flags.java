package com.company;

public class Flags {

    public enum FlagSize {Small, Medium, Large}

    public static void main(String[] args) {
        DrawPolishFlag(FlagSize.Medium);
        System.out.print("\n---\n\n"); // Odstęp
        DrawJapanFlag(FlagSize.Medium);
    }

    private static void DrawPolishFlag(FlagSize size) {
        var numberSize = GetNumberSize(size);

        for (int i = 0; i < numberSize / 6; i++) {
            for (int x = 0; x < numberSize; x++)
                System.out.print("`");
            System.out.println();
        }

        for (int i = 0; i < numberSize / 6; i++) {
            for (int x = 0; x < numberSize; x++)
                System.out.print("*");
            System.out.println();
        }
    }

    private static void DrawJapanFlag(FlagSize size) {
        var numberSize = GetNumberSize(size);

        for (int i = 1; i < numberSize / 8; i++) { // Góra flagi
            for (int x = 0; x < numberSize; x++)
                System.out.print("-");
            System.out.println();
        }

        for (int i = 2; i < numberSize / 4; i++) { // Pseudo kółko w środku
            for (int x = 0; x < numberSize; x++) {
                if (i <= numberSize / 8) {
                    if (x > (numberSize / 2) - ((numberSize / 6) + i) && x < (numberSize / 2) + ((numberSize / 6) + i))
                        System.out.print("*");
                    else
                        System.out.print("-");
                } else {
                    if (x > (numberSize / 2) - ((numberSize / 2) - i - 1) && x < (numberSize / 2) + ((numberSize / 2) - i - 1))
                        System.out.print("*");
                    else
                        System.out.print("-");
                }
            }
            System.out.println();
        }

        for (int i = 1; i < numberSize / 8; i++) { // Dół flagi
            for (int x = 0; x < numberSize; x++)
                System.out.print("-");
            System.out.println();
        }
    }

    private static int GetNumberSize(FlagSize size) {
        switch (size) {
            case Small:
                return 16;
            case Medium:
                return 24;
            case Large:
                return 36;
        }
        return -1;
    }

}
