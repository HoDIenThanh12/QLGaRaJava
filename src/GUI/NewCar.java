/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Connected.Query;
import DAO.CarDAO;
import Entity.Car;
import java.awt.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thành Lùn PiPi
 */
public class NewCar extends javax.swing.JFrame {
    private static int _idC=-1;
    private static int _ttC=0;
    /**
     * Creates new form NewCart
     */
    public NewCar() {
        
        initComponents();
        getNSX();
        LoadC();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gtTrangthai = new javax.swing.ButtonGroup();
        car = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnThemC = new javax.swing.JButton();
        btnLMC = new javax.swing.JButton();
        txtNameCar = new javax.swing.JTextField();
        txtHSX = new javax.swing.JTextField();
        cbbSochongoi = new javax.swing.JComboBox<>();
        cbbNamsx = new javax.swing.JComboBox<>();
        cbbNambh = new javax.swing.JComboBox<>();
        txtGia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnCloseC = new javax.swing.JButton();
        btnXoaC = new javax.swing.JButton();
        btnSuaC = new javax.swing.JButton();
        btnLuuC = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtTimIDC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTimTenC = new javax.swing.JTextField();
        btnTimIDC = new javax.swing.JButton();
        btnTimTenC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbC = new javax.swing.JTable();
        banC = new javax.swing.JRadioButton();
        cbanC = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtGiabanC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        car.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                carComponentShown(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm mới xe ô tô");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên xe: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Hãng sản xuất: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Số chỗ ngồi:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Giá mua: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Năm sản xuất: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Năm bảo hành: ");

        btnThemC.setText("Thêm xe");
        btnThemC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCActionPerformed(evt);
            }
        });

        btnLMC.setText("Làm mới");
        btnLMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLMCActionPerformed(evt);
            }
        });

        cbbSochongoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "7", "12", "24" }));

        cbbNambh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("đ");

        btnCloseC.setText("Quay lại");
        btnCloseC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseCActionPerformed(evt);
            }
        });

        btnXoaC.setText("Xóa");
        btnXoaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCActionPerformed(evt);
            }
        });

        btnSuaC.setText("Sữa");
        btnSuaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCActionPerformed(evt);
            }
        });

        btnLuuC.setText("Lưu");
        btnLuuC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuCActionPerformed(evt);
            }
        });

        jLabel9.setText("Tìm mã:");

        jLabel10.setText("Tìm tên:");

        btnTimIDC.setText("Tìm Mã");
        btnTimIDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimIDCActionPerformed(evt);
            }
        });

        btnTimTenC.setText("Tìm tên");
        btnTimTenC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimTenCActionPerformed(evt);
            }
        });

        tbC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên xe", "Hãng SX", "Sỗ chỗ", "Giá mua", "Giá bán", "Năm SX", "Năm bảo hành", "Trạng thái", "Ngày mua"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbC);

        gtTrangthai.add(banC);
        banC.setText("Đã bán");

        gtTrangthai.add(cbanC);
        cbanC.setSelected(true);
        cbanC.setText("Chưa bán");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Trạng thái:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Giá bán:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("đ");

        javax.swing.GroupLayout carLayout = new javax.swing.GroupLayout(car);
        car.setLayout(carLayout);
        carLayout.setHorizontalGroup(
            carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(carLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(carLayout.createSequentialGroup()
                        .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNameCar, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(cbbSochongoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHSX))
                            .addGroup(carLayout.createSequentialGroup()
                                .addComponent(banC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbanC)))
                        .addGap(49, 49, 49)
                        .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(carLayout.createSequentialGroup()
                                .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbNamsx, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbNambh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(carLayout.createSequentialGroup()
                                .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtGiabanC))
                                .addGap(18, 18, 18)
                                .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel13)))))
                    .addGroup(carLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimIDC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimIDC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimTenC, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimTenC)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnThemC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSuaC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoaC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLMC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLuuC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCloseC))
                .addGap(133, 133, 133))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carLayout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        carLayout.setVerticalGroup(
            carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(carLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(txtNameCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(carLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtHSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtGiabanC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))))
                        .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(carLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbbSochongoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(banC)
                                    .addComponent(cbanC)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7)
                                    .addComponent(cbbNambh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTimTenC)
                                    .addComponent(txtTimTenC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(txtTimIDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTimIDC))
                                .addGap(26, 26, 26))
                            .addGroup(carLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(carLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbbNamsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThemC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoaC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSuaC)
                        .addGap(11, 11, 11)
                        .addComponent(btnLMC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLuuC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCloseC)
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(car, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(car, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_carComponentShown
        // TODO add your handling code here:
        KhoaC();
        LoadC();
    }//GEN-LAST:event_carComponentShown
    public int idCho(int i){
        
        if(i==7)
            return 1;
        if(i==12)
            return 2;
        if(i==24)
            return 3;
        return 0;
    }
    private void tbCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCMouseClicked
        // TODO add your handling code here:
        KhoaC();
        _ttC=0;
        int r=tbC.getSelectedRow();
        _idC=(int)(tbC.getValueAt(r, 0));
        String name=(String)(tbC.getValueAt(r, 1));
        String hsx=(String)(tbC.getValueAt(r, 2));
        String st=(String)(tbC.getValueAt(r, 8));
        double giamua=(double)(tbC.getValueAt(r, 4));
        double giaban=(double)(tbC.getValueAt(r, 5));
        LocalDateTime cr = LocalDateTime.now();
        int nam=cr.getYear();
        int nsx=(int)(tbC.getValueAt(r, 6));
        int nbh=(int)(tbC.getValueAt(r, 7))-1;
        
        int cho=idCho((int)(tbC.getValueAt(r, 3)));
        int idNXS=5-(nam-nsx);
        cbbNamsx.setSelectedIndex(idNXS);
        cbbSochongoi.setSelectedIndex(cho);
        cbbNambh.setSelectedIndex(nbh);
        //JOptionPane.showMessageDialog(null,nbh);
        if(st.equals("Đã bán"))
            banC.setSelected(true);
        else
            cbanC.setSelected(true);
        txtNameCar.setText(name);
        txtHSX.setText(hsx);
        txtGia.setText(""+giamua);
        txtGiabanC.setText(""+giaban);
    }//GEN-LAST:event_tbCMouseClicked

    private void btnXoaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCActionPerformed
        // TODO add your handling code here:
        _ttC=0;
        if(_idC==-1){
            JOptionPane.showMessageDialog(null, "Chưa chọn nhân viên để xóa!");
        }
        else{
            int ret = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa không??", "Confirm", JOptionPane.YES_NO_OPTION);
            if(ret == JOptionPane.YES_OPTION) {
                Query.DeleteCar(_idC);
                LoadC();
                KhoaC();
                XTC();
            }
        }
    }//GEN-LAST:event_btnXoaCActionPerformed

    private void btnSuaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCActionPerformed
        // TODO add your handling code here:
        _ttC=2;
        MoC();
    }//GEN-LAST:event_btnSuaCActionPerformed

    private void btnLMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLMCActionPerformed
        // TODO add your handling code here:
        _ttC=0;
        XTC();
    }//GEN-LAST:event_btnLMCActionPerformed
    private boolean Kiemtra(String s1, String s2, String s3){
        if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty()  ){
            return true;
        }
        return false;
    }
    private boolean KiemTraSo(String s){
        int i=s.length();
        for(int j=0;j<i;j++){
            if(s.charAt(j)>='a' && s.charAt(j)<='z' || s.charAt(j)>='A' && s.charAt(j)<='A'){
                return  true;
            }
        }
        return false;
    }
    private void btnLuuCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuCActionPerformed
        // TODO add your handling code here:
        if(_ttC!=0){
        
        if(Kiemtra(txtNameCar.getText().toString(),txtGia.getText().toString(),txtHSX.getText().toString())){
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập đầy đủ thông tin");
         }
         else{
            if(KiemTraSo(txtGia.getText())){
                JOptionPane.showMessageDialog(null, "Giá phải là số");
            }
            else{
                String ten=txtNameCar.getText().trim();
                float giamua=Float.parseFloat(txtGia.getText().trim());
                float giaban=Float.parseFloat(txtGiabanC.getText().trim());
                String hsx=txtHSX.getText().trim();
                int nsx=Integer.parseInt((String)cbbNamsx.getSelectedItem());
                int nbh=Integer.parseInt((String)cbbNambh.getSelectedItem());
                int cho=Integer.parseInt((String)cbbSochongoi.getSelectedItem());
                LocalDateTime cr = LocalDateTime.now();
                String datemua=""+cr.getDayOfMonth()+"/"+cr.getMonthValue()+"/"+cr.getYear();
                
                String ts="";
                if(banC.isSelected())
                    ts="Đã bán";
                else
                    ts="Chưa bán";
                //JOptionPane.showMessageDialog(null, datemua);
                if(_ttC==1){
                    Car sale=new Car(0,ten, hsx, cho, giamua, giaban,nsx,nbh,ts,datemua);
                    CarDAO s =new CarDAO();
                    s.addNew(sale);
                    LoadC();
                    XTC();
                    KhoaC();
                    JOptionPane.showMessageDialog(null, "Thêm xe thành công");
                }
                if(_ttC==2){
                    //JOptionPane.showMessageDialog(null, idSale);
                    Car sale=new Car(_idC,ten, hsx, cho, giamua, giaban,nsx,nbh,ts,datemua);
                    CarDAO s =new CarDAO();
                    s.update(sale);
                    LoadC();
                    XTC();
                    KhoaC();
                    JOptionPane.showMessageDialog(null, "Sữa xe thành công");
                }
                //lSale.add(sale);
                
            }  
        }
        }
    }//GEN-LAST:event_btnLuuCActionPerformed

    private void btnThemCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCActionPerformed
        // TODO add your handling code here:
        _ttC=1;
        _idC=-1;
        MoC();
        XTC();
    }//GEN-LAST:event_btnThemCActionPerformed
    public void TimIDSale(int id){
        KhoaC();
        //String sql="select nv.ID, nv.Name, nv.Age, nv.Age, nv.Adress, nv.NumberPhone, nv.language from NhanVien nv where nv.ID="+id+"";
        ArrayList<Car> lSale=new CarDAO().finByIDStaff(id);
        //JOptionPane.showMessageDialog(null, "sfdsf");
        model(lSale);
    }
    public void TimTenSale(String ten){
        KhoaC();
        txtTimIDC.setText("");
        ArrayList<Car> lSale=new CarDAO().finByNameStaff(ten);
        //JOptionPane.showMessageDialog(null, "sfdsf");
        model(lSale);
        //String sql="select nv.ID, nv.Name, nv.Age, nv.Age, nv.Adress, nv.NumberPhone, nv.language from NhanVien nv where nv.Name=N'"+ten+"'";
    }
    private void btnTimIDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimIDCActionPerformed
        // TODO add your handling code here:
        if(txtTimIDC.getText().equals("")){
            LoadC();
        }
        else{
            int idSale=Integer.parseInt(txtTimIDC.getText().toString());
            TimIDSale(idSale);
        }
    }//GEN-LAST:event_btnTimIDCActionPerformed

    private void btnTimTenCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimTenCActionPerformed
        // TODO add your handling code here:
        if(txtTimTenC.getText().equals("")){
            //JOptionPane.showMessageDialog(null, "đas");
            LoadC();
        }
        else{
            txtTimIDC.setText("");
            //JOptionPane.showMessageDialog(null, "123");
            TimTenSale(txtTimTenC.getText().toString().trim());
        }
    }//GEN-LAST:event_btnTimTenCActionPerformed

    private void btnCloseCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseCActionPerformed
        // TODO add your handling code here:
        _ttC=0;
        XTC();
        KhoaC();
        Menu m= new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCloseCActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void getNSX(){
        LocalDateTime current = LocalDateTime.now();
        String d=""+current.getMonthValue()+"";
        //txt1.setText(""+d);
        int nam=current.getYear();
        for(int i=nam-5;i<=nam;i++){
            String s=""+i;
            cbbNamsx.addItem(s);
        }
    }
    /*khoang trắng */
    public void XTC(){
        txtGiabanC.setText("");
        txtNameCar.setText("");
        txtHSX.setText("");
        txtGia.setText("");
    }
    public void KhoaC(){
        cbbNambh.setEnabled(false);
        cbbNamsx.setEnabled(false);
        cbbSochongoi.setEnabled(false);
        banC.setEnabled(false);
        cbanC.setEnabled(false);
        txtGiabanC.setEnabled(false);
        txtNameCar.setEnabled(false);
        txtHSX.setEnabled(false);
        txtGia.setEnabled(false);
    }
    public void MoC(){
        cbbNambh.setEnabled(true);
        cbbNamsx.setEnabled(true);
        cbbSochongoi.setEnabled(true);
        banC.setEnabled(true);
        txtGiabanC.setEnabled(true);
        cbanC.setEnabled(true);
        txtNameCar.setEnabled(true);
        txtHSX.setEnabled(true);
        txtGia.setEnabled(true);
    }
    public  void model(ArrayList<Car> lC){
        tbC.removeAll();
        LocalDateTime cr = LocalDateTime.now();
        String [] arr={"ID","Tên xe","Háng SX","Số chỗ","Giá mua","Giá bán","Năm SX","Năm bảo hành","Trạng thái","Ngày mua"};
        DefaultTableModel model = new DefaultTableModel(arr,0);
        
        //model.addRow(arr);
        int i=0;
        for(Car s: lC){
            
            i++;
            model.addRow(new Object[]{s.getId(), s.getName(),s.getManufacturer(),s.getnSeats(),s.getPriceBuy(),s.getPrice(),s.getYearManufacturer(),s.getWarrantyPeriod(),s.getStatus(),s.getDateBuy()});
        }
        //JOptionPane.showMessageDialog(null, i);
        tbC.setModel(model);
    };
    public void LoadC(){
        KhoaC();
        txtTimIDC.setText("");
        txtTimTenC.setText("");
        //JOptionPane.showMessageDialog(null, "đã laod");
        ArrayList<Car> lSale=new CarDAO().getAll();
        model(lSale); 
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewCar().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton banC;
    private javax.swing.JButton btnCloseC;
    private javax.swing.JButton btnLMC;
    private javax.swing.JButton btnLuuC;
    private javax.swing.JButton btnSuaC;
    private javax.swing.JButton btnThemC;
    private javax.swing.JButton btnTimIDC;
    private javax.swing.JButton btnTimTenC;
    private javax.swing.JButton btnXoaC;
    private javax.swing.JPanel car;
    private javax.swing.JRadioButton cbanC;
    private javax.swing.JComboBox<String> cbbNambh;
    private javax.swing.JComboBox<String> cbbNamsx;
    private javax.swing.JComboBox<String> cbbSochongoi;
    private javax.swing.ButtonGroup gtTrangthai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbC;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtGiabanC;
    private javax.swing.JTextField txtHSX;
    private javax.swing.JTextField txtNameCar;
    private javax.swing.JTextField txtTimIDC;
    private javax.swing.JTextField txtTimTenC;
    // End of variables declaration//GEN-END:variables
}