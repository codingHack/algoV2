package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2991_�糪� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//��޺θ� ���� �迭
		final int PERSON_NUM=3;
		int []arr=new int[PERSON_NUM];
		
		/* input ó��*/
		st = new StringTokenizer(br.readLine());	
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		int C=Integer.parseInt(st.nextToken());
		int D=Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		arr[0]=Integer.parseInt(st.nextToken());//P
		arr[1]=Integer.parseInt(st.nextToken());//M
		arr[2]=Integer.parseInt(st.nextToken());//N
	
		
		//���ݽð�+�޽Ľð� �� ���� �� �������� ���
		//0 �̰ų� A���� ũ�ٸ� ���ݹ��� ����.
		for(int i=0;i<PERSON_NUM;i++) {
			int result=0;
		
			int remainTime=arr[i]%(A+B);
			if(remainTime!=0&&remainTime<=A) {
				result++;
			}
			
			remainTime=arr[i]%(C+D);
			if(remainTime!=0&&remainTime<=C) {
				result++;
			}
			
			System.out.println(result);
		}


	}

}
/*
����
â�� ������ ��ü��, ������޿�, �Ź���޿��� ����̳� ���� ���� ���� �ſ� �Ⱦ��Ѵ�. �� ������ ����̳� ������ �糪�� �� �� ������ ��Ű�� �ֱ� �����̴�. ������, �׵��� �� ���� �ൿ�� ���� �����ϴٴ� ���� �𸣰� �ִ�.

���� ��ħ, �� �Ѹ����� A�е��� �������̰�, B�е��� ������ ���� �ִ�. �Ǵٸ� ���� C�е��� �������̰�, D�е��� ������ ����. �� ���� �� �ൿ�� ����ؼ� ���������� �ݺ��Ѵ�.

��ü��, �Ź���޿�, ������޿��� ���� �ð��� �־����� ��, �� �� �������� ������ �޴��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� A, B, C, D�� �־�����. 

��° �ٿ��� P, M, N�� �־�����. P�� ��ü���� ���� �ð�, M�� ������޿��� ���� �ð�, N�� �Ź���޿��� ���� �ð��̴�. ���� ��ħ�� �����ϴ� �ð��� 0�̶�� �Ѵ�. ���� �ð��� ��ħ�� ������ �� ���� �ð��̴�. ���� ���, P�� 3�̸�, ��ü�δ� ��ħ�� �����ϰ� �� ��° ���� ����Ǵ� �߿� �����ߴٴ� ���̴�.

��� ���� 1���� ũ�ų� ����, 999���� �۰ų� ���� �����̴�.

���
ù° �ٿ��� ��ü��, ��° �ٿ��� ������޿�, ��° �ٿ��� �Ź���޿��� �� �� �������� ���� �޴��� ����Ѵ�.

���� �Է� 1 
2 2 3 3
1 3 4

���� ��� 1 
2
1
0
*/