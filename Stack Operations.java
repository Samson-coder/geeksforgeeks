import java.util.*;
import java.io.*;
class stackop{
    public static void insert(Stack<Integer> st,int N){
        st.push(N);
    }
    public static void remove(Stack<Integer> st){
        st.pop();
    }
    public static void head(Stack<Integer> st){
        System.out.println(st.peek());
    }
    public static void find(Stack<Integer> st,int N){
        int a = st.search(N);
        if(a!=-1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
public class Main{
    public static void main(String[] args){
        stackop ob = new stackop();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Stack<Integer> st = new Stack<Integer>();
            int q = sc.nextInt();
            while(q-- >0){
                char c = sc.next().charAt(0);
                if(c=='i'){
                    int n = sc.nextInt();
                    ob.insert(st,n);
                }
                else if(c=='r'){
                    ob.remove(st);
                }
                else if(c=='h'){
                    ob.head(st);
                }
                else{
                    int n = sc.nextInt();
                    ob.find(st,n);
                }
            }
        }
    }
}
