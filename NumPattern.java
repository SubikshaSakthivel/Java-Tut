import java.util.*;

class NumPattern {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Take user input
        

        for (int i = n; i > 0; i--)  // Loop for rows
        {
            for (int j = n; j > 0; j--)  // Loop for columns
            {
                System.out.print('*');  // Print '*'
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
// OUTPUT
// 4
// ****
// ****
// ****
// ****