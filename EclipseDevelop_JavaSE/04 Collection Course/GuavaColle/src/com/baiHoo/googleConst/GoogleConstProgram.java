package com.baiHoo.googleConst;

import java.util.Set;

import com.google.common.base.Preconditions;
import com.google.common.collect.Constraint;
import com.google.common.collect.Constraints;
import com.google.common.collect.Sets;

/**
 * �s���l�����ǿգ�������֤ ����ʽ��� 1. Predicate ���ԣ��϶�; ����������; ʹ����; 2. Function 3. Constraint
 * Լ��
 * 
 * @author Administrator
 *
 */
public class GoogleConstProgram {

	public static void main(String[] args) {
		Set<String> set = Sets.newHashSet();
		Constraint<String> constr = new Constraint<String>() {
			@Override
			// �s���l��
			public String checkElement(String element) {
				// �ǿ���C
				Preconditions.checkNotNull(element);
				// �L����C5-20�L��
				Preconditions.checkArgument(element.length() > 5 && element.length() < 20);
				return element;
			}
		};
		Set<String> constrSet = Constraints.constrainedSet(set, constr);
		//java.lang.NullPointerException
		//constrSet.add(null);
		//java.lang.IllegalArgumentException
		//constrSet.add("bai");
		constrSet.add("baiHoo");
		for (String string : constrSet) {
			System.out.println(string);
		}
	}
}
