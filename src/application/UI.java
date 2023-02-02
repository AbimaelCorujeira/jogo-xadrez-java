package application;

import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pieces.length; j++) {
                printPieces(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.print("  a b c d e f g h");
    }

    private static void printPieces(ChessPiece pieces) {
        if(pieces == null) {
            System.out.print("-");
        } else {
            System.out.print(pieces);
        }
        System.out.print(" ");
    }
}
