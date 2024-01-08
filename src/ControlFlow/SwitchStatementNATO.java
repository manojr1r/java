package ControlFlow;

public class SwitchStatementNATO {
    public static void main(String[] args) {

        day('a');
        day('h');
    }
        public static void day ( char word){
            switch (word) {
                case 'A':
                case 'a':
                    System.out.println("Able");
                    break;
                case 'B':
                case 'b':
                    System.out.println("Baker");
                    break;
                case 'C':
                case 'c':
                    System.out.println("Charlie");
                    break;
                case 'D':
                case 'd':
                    System.out.println("Dog");
                    break;
                case 'E':
                case 'e':
                    System.out.println("Easy");
                    break;
                default:
                    System.out.println("Not Found");
                    break;

            }

        }
    }
