import java.util.*;
public class VowelOrNot{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        {
            char c = sc.next().charAt(0);
            if(c=='A'|| c=='a')
            {
                System.out.println("Vowel");
            }
            else if(c=='E'|| c=='e')
            {
                System.out.println("Vowel");
            }
            else if(c=='I'|| c=='i')
            {
                System.out.println("Vowel");
            }
            else if(c=='O'|| c=='o')
            {
                System.out.println("Vowel");
            }
            else if(c=='U'|| c=='u')
            {
                System.out.println("Vowel");
            }
            else
            {
                System.out.println("Consonant");
            }
        }
    }
}