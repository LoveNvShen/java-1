package com.lcg.tools;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.oracore.OracleType;

public class TestProcedure {
	
	public static void main(String[] args) {
		
		//��ȡ����
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//��ȡ����
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			//��Statement
			CallableStatement state = conn.prepareCall("{call PRO_WANGKAI(?,?,?,?)}");
			//������
			state.setInt(1, 10);
			state.setInt(2, 10);
			state.setString(3, "*");
			state.registerOutParameter(4, OracleType.STYLE_FLOAT);
			//ִ��
			state.execute();
			//��ȡ���
			Float res = state.getFloat(4);
			System.out.println(res);
			//�ͷ���Դ
			state.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	

}
