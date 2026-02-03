class Assignment6 {

    public static void main(String arg[]) {

        try {

            method1();
        } catch (Exception e) {

            System.out.println(" caught exception thrown by method 3 ");
            e.printstacktrace();
        }

    }

}

static void method1() throws Exception

{
    method2();
}

static void method2() throws Exception

{
    method3();
}

static void method3() throws Exception

{
    throw new Exception(" throws exception to main method ");
}