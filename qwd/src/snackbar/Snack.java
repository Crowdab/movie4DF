package snackbar;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import c_loginout.Sign_in;

public class Snack extends JPanel {
	Sign_in sign_in;
	private JTable table;
	private JScrollPane jscroll;
    private DefaultTableModel tableModel;
    Object ob[][] = new Object[0][3];
    String[] title = {"총주문내역","수량","가격"};
    private JLabel lblNewLabel_1;
	
	
	
	public Snack(Sign_in signin) {
		this.sign_in = signin;
		this.setLayout(null);
		
		JButton back_bt = new JButton("뒤로가기");
		back_bt.setBounds(41, 31, 158, 42);
		this.add(back_bt);
		
		JButton snack1point_charge_bt = new JButton("포인트충전");
		snack1point_charge_bt.setBounds(596, 31, 158, 42);
		this.add(snack1point_charge_bt);
		
		JLabel lblNewLabel = new JLabel(signin.cvo.getCust_name() + " 님");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(284, 31, 158, 29);
		this.add(lblNewLabel);
		
		JLabel snack1_point_label = new JLabel("잔여포인트 : " + signin.cvo.getPoint());
		snack1_point_label.setHorizontalAlignment(SwingConstants.CENTER);
		snack1_point_label.setBounds(284, 57, 158, 29);
		this.add(snack1_point_label);
		
		JButton btnNewButton_2 = new JButton("팝콘");
		btnNewButton_2.setBounds(199, 91, 131, 42);
		this.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("음료");
		btnNewButton_2_1.setBounds(331, 91, 131, 42);
		this.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("사이드");
		btnNewButton_2_1_1.setBounds(463, 91, 131, 42);
		this.add(btnNewButton_2_1_1);
		
		JButton snack_pop1 = new JButton("팝콘1");
		snack_pop1.setBounds(92, 147, 203, 135);
		this.add(snack_pop1);
		
		JButton snack_pop2 = new JButton("팝콘2");
		snack_pop2.setBounds(295, 147, 203, 135);
		this.add(snack_pop2);
		
		JButton snack_pop3 = new JButton("팝콘3");
		snack_pop3.setBounds(500, 147, 203, 135);
		this.add(snack_pop3);
		
		JButton snack_pop4 = new JButton("팝콘4");
		snack_pop4.setBounds(92, 284, 203, 135);
		this.add(snack_pop4);
		
		JButton snack_pop5 = new JButton("팝콘5");
		snack_pop5.setBounds(295, 284, 203, 135);
		this.add(snack_pop5);
		
		JButton snack_pop6 = new JButton("팝콘6");
		snack_pop6.setBounds(500, 284, 203, 135);
		this.add(snack_pop6);
		
		JButton snack_pop7 = new JButton("팝콘7");
		snack_pop7.setBounds(92, 422, 203, 135);
		this.add(snack_pop7);
		
		JButton snack_pop8 = new JButton("팝콘8");
		snack_pop8.setBounds(295, 422, 203, 135);
		this.add(snack_pop8);
		
		JButton snack_pop9 = new JButton("팝콘9");
		snack_pop9.setBounds(500, 422, 203, 135);
		this.add(snack_pop9);
		
	
		
		
		
		JButton btnNewButton_4 = new JButton("구매하기");
		btnNewButton_4.setBounds(510, 706, 193, 42);
		this.add(btnNewButton_4);
		
		tableModel = new DefaultTableModel(ob, title);
		table = new JTable(tableModel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(91, 567, 612, 135);
		this.add(scrollPane);
		
		scrollPane.setViewportView(table);
		
		lblNewLabel_1 = new JLabel("합계금액 : 0");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(92, 706, 243, 42);
		add(lblNewLabel_1);
		
		JButton reset_bt = new JButton("비우기");
		reset_bt.setBounds(331, 706, 173, 42);
		add(reset_bt);

		// 돌아가기
		back_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sign_in.card.show(sign_in.pg, "main_login");
			}
		});
	}
}
