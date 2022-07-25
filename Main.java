package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//�Է��� ���� ���۸���
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		//���۸������� �о�� ������ ������ �������� ���������� StringTokenizer
		int N = Integer.parseInt(st.nextToken());
		//ù��° ���� n�� ����� ���� StringTokenizer.nextToken
		int X = Integer.parseInt(st.nextToken());
		//����������� 2��° , st�� ù��° �Է°� ��� �Ϸ�
		StringBuilder sb = new StringBuilder();
		//���ڿ��� �����ϱ� ���� StringBuilder
		st = new StringTokenizer(bf.readLine());
		// �ι�° �Է��� ���� StringTokenizer
		for(int i=0;i<N;i++) {
		// �Է¹��� ���� �ɰ��� ���� for
			int v = Integer.parseInt(st.nextToken()); //
			// ���� �����ϴ°� �ƴ϶� ������ ���ǿ� �´� �͸� ����� ���� �ӽ��� ���庯��
			if(v<X) {
			// ������ ����
				sb.append(v+" ");
				// StringBuilder���� ���ڿ��� �����Ű�� �Լ�
			}
		}
		
		System.out.println(sb);
		//�����
	}

}
