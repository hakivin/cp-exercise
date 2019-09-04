package com.hakivin.cptestjava;

public class GettingJumpOnCrime {

    private static double G = 9.80665;
    private static double angle = 45;

    private static int dx = 4;
    private static int dy = 4;
    private static int w = 100;
    private static int v = 55;
    private static int lx = 1;
    private static int ly = 1;
    private static int[][] buildingsHeight = {
            {0,10,20,30},
            {10,20,30,40},
            {20,30,200,50},
            {30,40,50,60}
    };

    private static int[][] results = new int[dy][dx];

    public static void main(String[] args){





        for (int i = 0; i < buildingsHeight.length; i++){
            for (int j = 0; j < buildingsHeight[i].length;j++){
                int locx = Math.abs(lx-1-i);
                int locy = Math.abs(ly-1-j);
                double distance = Math.sqrt(Math.pow(locx*w,2)+Math.pow(locy*w,2));
                System.out.println("distance of (" + i + "," + j + ") is " + distance);
                if (distance == 0)
                    results[i][j] = 0;
                else {
                    boolean isDone = false;
                    while (!isDone){
                        double tetha = Math.toRadians(angle);
                        double t = distance/(v*Math.sin(tetha));
                        double y = buildingsHeight[lx-1][ly-1]+v*t*Math.sin(tetha)-0.5*G*t*t;
                        System.out.println("height of (" + i + "," + j + ") is " + buildingsHeight[i][j]);
                        System.out.println("current height with " + angle + " degree is " + y);
                        if (y >= buildingsHeight[i][j]){
                            results[i][j] += 1;
                            isDone = true;
                        } else {
                            int[] coordinate = getClosest(locx, locy, i, j);
                            locx = coordinate[0];
                            locy = coordinate[1];
                            results[i][j] += 1;
                        }
                    }
                }
                System.out.println();
            }
        }
        for (int[] array : results){
            for (int a : array){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    private static int[] getClosest(int x1, int y1, int x2, int y2){
        int[] coordinates = new int[2];
        if (y1 == y2){
            if (x1 > x2){
                coordinates[0] = x2+1;
                coordinates[1] = y2;
            }
            else {
                coordinates[0] = x2-1;
                coordinates[1] = y2;
            }
        }
        else if (x1 == x2){
            if (y1 > y2){
                coordinates[0] = x2;
                coordinates[1] = y2+1;
            }
            else {
                coordinates[0] = x2;
                coordinates[1] = y2-1;
            }
        }
        return coordinates;
    }
}
