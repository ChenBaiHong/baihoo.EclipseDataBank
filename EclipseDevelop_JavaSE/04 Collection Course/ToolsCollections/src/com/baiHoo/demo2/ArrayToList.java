package com.baiHoo.demo2;

import java.util.*;

/**
 * 
 * @author Administrator
 *	ע�⣬���ص� List �ǲ����޸ĵģ�����������������������Ԫ�ؽ��׳�һ�� UnsupportedOperationException��
 *���ң����� Arrays.asList() ʹ�� varargs ������ʾ��ӵ� List ��Ԫ�أ����Ի�����ʹ�������ɵ����� new �½��Ķ��󴴽� List��
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