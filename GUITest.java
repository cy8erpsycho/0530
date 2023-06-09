import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
/*
 * 이벤트프로그래밍 ex)버튼이 클릭되었을 '때' 콘솔에 "클릭"메세지 출력하기
 * 1)이벤트소스 결정 bt
 * 2)이벤트종류 결정 ActionEvent
 * 3)이벤트핸들러 작성 class MyHandler implements ActionListener{
 * 					 public void actionPerformed(ActionEvent e){
 * 						sop("클릭");
 * 						}
 * 					} 
 * 4)이벤트소스와 이벤트핸들러 연결
 * 	 bt.addActionlistener (new MyHandler());
 */


/*
 * 콘솔에 한줄입력란의 내용이 출력
 */
//class MyHandler implements ActionListener{
//	private JTextField tf;
//	MyHandler(JTextField tf){
//		this.tf = tf;
//	}
//	public void actionPerformed(ActionEvent e){
//		//System.out.println("클릭");
//		String line = tf.getText();// 다른클래스의 멤버변수를 사용할수는 없다
//		System.out.println(line);
//	}
//}


public class GUITest {
	private JFrame fr;
	private JButton bt;
	private JTextField tf;
	
	class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//System.out.println("클릭");
			String line = tf.getText();// 다른클래스의 멤버변수를 사용할수는 없다
			System.out.println(line);
		}
	}
	
	
	public GUITest() {
		fr = new JFrame("실습");
		//프레임
		bt = new JButton("버튼");
		//버튼객체
		tf = new JTextField("한줄입력란");
		Container c = fr.getContentPane();
		//프레임의 뒷판
		c.setLayout(new GridLayout(2,1));//new FlowLayout());
		c.add(tf);//컴포넌트 추가
		c.add(bt);//컴포넌트 추가

//		bt.addActionListener(new MyHandler(tf));
		bt.addActionListener(new Handler());
		
		fr.setSize(300,200);
		//프레임크기지정
		fr.setVisible(true);//프레임보여주기
	}
	public static void main(String[] args) {
		new GUITest();

	}

}
