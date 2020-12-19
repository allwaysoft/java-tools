public class JavaArch{
        public static void main(String[] args){
                String arch = System.getProperty("sun.arch.data.model");
                System.out.println("arch:"+arch);
        }
}