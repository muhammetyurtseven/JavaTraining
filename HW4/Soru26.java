char[][] ticTacToe = new char[3][3]; // r1 tanýmlama doðru þekilde
ticTacToe[1][3] = 'X'; // r2//dizi 3 boyutlu oldugunda 0,1,2 deðerleri geçerlidir burada hata verecektir.
ticTacToe[2][2] = 'X';
ticTacToe[3][1] = 'X';
System.out.println(ticTacToe.length + " in a row!"); // r3