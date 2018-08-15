package com.baiHoo.demo2;

import java.util.*;

/**
 * 
 * @author Administrator
 *	注意，返回的 List 是不可修改的，所以如果尝试向其中添加新元素将抛出一个 UnsupportedOperationException。
 *而且，由于 Arrays.asList() 使用 varargs 参数表示添加到 List 的元素，所以还可以使用它轻松地用以 new 新建的对象创建 List。
 */
public class ArrayToList
{
    public static void main(String[] args)
    {
        // This gives us nothing good
        System.out.println(args);
        
        // Convert args to a List of String
        List<String> argList = Arrays.asList(args);
        
        // Print them out
        System.out.println(argList);
    }
}