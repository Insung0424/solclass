package Temp;

import java.util.Random;

public class NumberSelect {
	//�ߺ����� �ζ� ��ȣ �����⿴���� 
	//���� ����� ��ü�����ν� Temp�� �̵��Ͽ����ϴ�
	
	Random random = new Random();
	int com[] = new int[6];
	
	public NumberSelect(){
		
		for(int i=0;i<6;i++) {
			com[i] = random.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(com[i] == com[j]) {
					i--;
				}
			}
		}
		
	}

	public int[] getCom() {
		return com;
	}

}
