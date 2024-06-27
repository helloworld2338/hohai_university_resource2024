public class EmbededFinally {
    public static void main(String args[]) {
        int result = 0;
        try {
            System.out.println("in Level 1");
            try {
                System.out.println("in Level 2");
                    result=100/0;  //Level 2
                try {
                    System.out.println("in Level 3");
                       result=100/0;  //Level 3
                } 
                catch (Exception e) {
                    System.out.println("Level 3:" + e.getClass().toString());
                }
                finally {
                    System.out.println("In Level 3 finally");
                }
                result=100/0;  //Level 2
            }
            catch (Exception e) {
                System.out.println("Level 2:" + e.getClass().toString());
            } finally {
                System.out.println("In Level 2 finally");
            }
              result = 100 / 0;  //level 1
        } 
        catch (Exception e) {
            System.out.println("Level 1:" + e.getClass().toString());
        }
        finally {
            System.out.println("In Level 1 finally");
        }
    }
}
