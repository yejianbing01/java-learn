package com.idbi.javaSE;

/**
 * @author idbi
 */
public class ExpectionDemo {
    public static void main(String[] args) throws Exception{
        int a = 1;
        int b = 0;
        try {
            System.out.println(a/b);
        }catch (Error e){
            System.out.println("error");
        }catch (Exception e){
            System.out.println("Exception");
        }catch (Throwable e){
            System.out.println("Throwable");
        }
        finally {
            System.out.println("finally");
        }


        try {
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        // 快捷键 control alt t

    }
}
