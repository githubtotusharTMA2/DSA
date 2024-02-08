// ** all are submitted on CodingNinjas & GFG
// The following solutions are of CodingNinjas
// 1 - N-forest:
public class Solution {
    public static void nForest(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// 2 - N/2-forest:
public class Solution {
    public static void nForest(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// 3 - N-Triangles:
public class Solution {
    public static void nTriangle(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// 4 - Triangle:
public class Solution {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

// 5 - Seeding:
public class Solution {
    public static void seeding(int n) {
        // Write your code here
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// 6 - Reverse number triangle:
public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// 7 - Star Triangle:
public class Solution {
    public static void nStarTriangle(int n) {
        for(int i = 0; i < n; i++) {
            // first loop for spaces
            for(int j = 0; j < n - i - 1; j++)
                System.out.print(" ");

            // second loop for *(stars)
            for(int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");
            
            System.out.println();
        }
    }
}

// 8 - Reverse Star Triangle:
public class Solution {
    public static void nStarTriangle(int n) {
        for(int i = 0; i < n; i++) {
            // first loop for spaces
            for(int j = 0; j < i; j++)
                System.out.print(" ");

            // second loop for stars(*)
            for(int j = 0; j < 2 * n - 1 - 2 * i; j++)
                System.out.print("*");
            
            System.out.println();
        }
    }
}

// 9 - Star Diamond:
public class Solution {
    public static void nStarDiamond(int n) {
        for(int i = 0; i < n; i++) {
            // first loop for spaces
            for(int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            
            // second loop for stars(*)
            for(int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");
            
            System.out.println();
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++)
                System.out.print(" ");
            
            for(int j = 0; j < 2 * n - 1 - 2 * i; j++)
                System.out.print("*");
            
            System.out.println();
        }
    }
}

// 10 - Rotated Triangle:
public class Solution {
    public static void nStarTriangle(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) 
                System.out.print("*");
            System.out.println();
        }
    }
}

// 11 - Binary Number triangle:
public class Solution {
    public static void nBinaryTriangle(int n) {
        String output = "";
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++)
                output += i % 2 == j % 2 ? "1 " : "0 ";
            
            output += "\n";
        }

        System.out.print(output);
    }
}

// 12 - Number Crown:
public class Solution {
    public static void numberCrown(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print(j + " ");
            
            for(int j = 1; j < 2 * n - 2 * i; j++)
                System.out.print(" ");

            for(int j = i; j >= 1; j--)
                System.out.print(j + " ");
            
            System.out.println();
        }
    }
}

// 13 - Increasing Number Triangle:
public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        String output = "";
        int count = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++)
                output += count++ + " ";
            
            output += "\n";
        }

        System.out.print(output);
    }
}

// 14 - Increasing Letter Triangle:
public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        String output = "";
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++)
                output += (char)(65 + j) + " ";
            
            output += "\n";
        }

        System.out.print(output);
    }
}

// 15 - Reverse Letter Triangle:
public class Solution {
    public static void nLetterTriangle(int n) {
        String output = "";
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++)
                output += (char)(65 + j) + " ";
            
            output += "\n";
        }

        System.out.print(output);
    }
}

// 16 - Alpha-Ramp:
public class Solution {
    public static void alphaRamp(int n) {
        // Write your code here
        String output = "";
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++)
                output += (char)(65 + i) + " ";
            
            output += "\n";
        }

        System.out.print(output);
    }
}

// 17 - Alpha Hill:
public class Solution {
    public static void alphaHill(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            
            for(int j = 0; j <= i; j++)
                System.out.print((char)(65 + j) + " ");
            
            for(int j = 0; j < i; j++)
                System.out.print((char)(65 + i - j - 1) + " ");
            
            System.out.println();
        }
    }
}

// 18 - Alpha Triangle:
public class Solution {
    public static void alphaTriangle(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print((char)(65 + n - 1 - j) + " ");
            }
            
            System.out.println();
        }
    }
}

// 19 - Symmetric Void:
public class Solution {
    public static void symmetry(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++)
                System.out.print("* ");
            
            for(int j = 0; j < i; j++)
                System.out.print("  ");
            
            for(int j = 0; j < n - i; j++)
                System.out.print("* ");
            
            System.out.println();
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++)
                System.out.print("* ");
            
            for(int j = 0; j < n - i; j++)
                System.out.print("  ");
            
            for(int j = 0; j <= i; j++)
                System.out.print("* ");
            
            System.out.println();
        }
    }
}

// 20 - Symmetry:
public class Solution {
    public static void symmetry(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++)
                System.out.print("* ");
            
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print("    ");
                // System.out.print("  ");
            }
            
            for(int j = 0; j <= i; j++)
                System.out.print("* ");
            
            System.out.println();
        }

        for(int i = 1; i < n; i++) {
            for(int j = 0; j <= n - i - 1; j++)
                System.out.print("* ");
            
            for(int j = 0; j < i; j++)
                System.out.print("    ");
            
            for(int j = 0; j <= n - i - 1; j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}

// 21 - Ninja And the Star Pattern 1:
public class Solution {
    public static void getStarPattern(int n) {
        String output = "";
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || j == 0) output += "*";
                else if(i == n - 1 || j == n - 1) output += "*";
                else output += " ";
            }
            
            output += "\n";
        }

        System.out.print(output);
    }
}

// 22 - Ninja And the Number Pattern:
public class Solution {
    public static void getNumberPattern(int n) {
        String output = "";
        for(int i = 0; i < 2 * n - 1; i++) {
            for(int j = 0; j < 2 * n - 1; j++) {
                int up = i - 0;
                int down = 2 * (n - 1) - i;
                int left = j - 0;
                int right = 2 * (n - 1) - j;
                int min = Math.min(Math.min(up, down), Math.min(left, right));
                output += (n - min);
            }

            output += "\n";
        }

        System.out.print(output);
    }
}