import javax.swing.*;
class ObjekGUI 
{
	public static void main(String args[])
	{
		GUI g = new GUI();
	}
}
class GUI extends JFrame
{
	final JTextField fnama = new JTextField(10);
	final JTextField falamat = new JTextField(10);
	JLabel lnama = new JLabel("Nama Lengkap");
	JLabel lalamat = new JLabel("Alamat");
	JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");
	JRadioButton rbpria = new JRadioButton("Laki Laki");
	JRadioButton rbperempuan = new JRadioButton("Perempuan");
	JLabel lagama = new JLabel(" Agama ");
	String[] namaAgama = {"Islam","Kristen","Katolik","Hindu","Buddha"};
	JComboBox cmbAgama = new JComboBox(namaAgama);
	JLabel lhobby = new JLabel(" Hobby ");
	JCheckBox cbsepakbola = new JCheckBox("Sepak Bola");
	JCheckBox cbbasket = new JCheckBox("Basket");
	JCheckBox cbbulutangkis = new JCheckBox("Bulu Tangkis");
	JCheckBox cbvoli = new JCheckBox("Voli");
	JButton btnSave = new JButton("OK");
	public GUI()
	{
		setTitle("Data Pribadi");
		setDefaultCloseOperation(3);
		setSize(400,250);
		ButtonGroup group = new ButtonGroup();
		group.add(rbpria);
		group.add(rbperempuan);
		setLayout(null);
		add(lnama);
		add(fnama);
		add(ljeniskelamin);
		add(rbpria);
		add(rbperempuan);
		add(lagama);
		add(cmbAgama);
		add(lhobby);
		add(cbsepakbola);
		add(cbbasket);
		add(btnSave);
		add(lalamat);
		add(falamat);
		add(cbbulutangkis);
		add(cbvoli);
		lnama.setBounds(10, 10, 120, 20);
		fnama.setBounds(130,10,150,20);
		lalamat.setBounds(10,30,120,20);
		falamat.setBounds(130,30,150,20);
		ljeniskelamin.setBounds(7,50,120,20);
		rbpria.setBounds(130,50,100,20);
		rbperempuan.setBounds(230,50,100,20);
		lagama.setBounds(7,70,120,20);
		cmbAgama.setBounds(130,70,150,20);
		lhobby.setBounds(7,90,150,20);
		cbsepakbola.setBounds(130,90,100,20);
		cbbasket.setBounds(230,90,150,20);
		cbbulutangkis.setBounds(130,110,100,20);
		cbvoli.setBounds(230,110,100,20);
		btnSave.setBounds(100,150,120,20);
		setVisible(true);
	}
}
