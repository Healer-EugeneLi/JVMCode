package com.eugeneli;

/**
 * @ClassName: StackTest
 * @Description:
 * @Author EugeneLi
 * @Date: 2021/11/6
 * @Time: 10:34
 *
 */
public class StackTest {



    public static void main(String[] args) {

        /**
         *Java使用栈设计的 通过对编译之后生成的class文件进行反编译 可以看到以下这样的信息  很显然完成这样一个操作
         * 需要很多条指令
         * 因为栈设计这种方法 就是指令集少 所以需要多条指令
         Code:
         stack=2, locals=4, args_size=1
         0: iconst_2
         1: istore_1
         2: iconst_3
         3: istore_2
         4: iload_1
         5: iload_2
         6: iadd
         7: istore_3
         8: return






         */

        int i=2;
        int j=3;
        int k=i+j;

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hello");

        /**

         执行过程中 存在一个Java虚拟机进程
         10224 StackTest
         1456 Jps
         16284 Launcher
         4924

         结束之后 这个进程就没了
         9672 Jps
         16284 Launcher
         4924

         */
    }
}
