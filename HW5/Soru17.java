do { 
    int count = 0; 
    do { count++; }
    while (count < 2); break;} 
    while (true);
    System.out.println(count); // println() d�ng�den sonra kapsam i�erisinde olmad�g�ndan derlenmez.