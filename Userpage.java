package DataObjects;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shubh
 */
public class Userpage extends javax.swing.JFrame {
	
	String ud,pd2;
	   String[] str2=new String[30];
       String[] str1=new String[30];
	int u=0,v=0;
    
   
    /**
     * Creates new form Userpage
     */
    public Userpage() {
        initComponents();
        jInternalFrame1.setFocusable(true);
        //test purpose
       // for(int i=0;i<v;i++)
        //	writec.addItem(str2[i]);
        //for(int i=0;i<u;i++)
          //  readc.addItem(str1[i]);
    }
  
     /* This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usrmsg = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        writec = new javax.swing.JComboBox<>();
        readc = new javax.swing.JComboBox<>();
        submitb = new javax.swing.JButton();
        logoutb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        usrmsg.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        usrmsg.setText("Welcome User");

        jInternalFrame1.setVisible(true);

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel2.setText("Perform Action :");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel3.setText("Read :");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel4.setText("Write :");

        writec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        writec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                writecFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                writecFocusLost(evt);
            }
        });
        writec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writecActionPerformed(evt);
            }
        });

        readc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        readc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                readcFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                readcFocusLost(evt);
            }
        });
        readc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readcActionPerformed(evt);
            }
        });

        submitb.setBackground(new java.awt.Color(102, 102, 255));
        submitb.setForeground(new java.awt.Color(255, 255, 255));
        submitb.setText("Submit");
        submitb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbActionPerformed(evt);
            }
        });

        logoutb.setBackground(new java.awt.Color(51, 255, 51));
        logoutb.setForeground(new java.awt.Color(255, 255, 255));
        logoutb.setText("Log Out");
        logoutb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(readc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(writec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(submitb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutb, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(readc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(writec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(submitb)
                .addGap(34, 34, 34)
                .addComponent(logoutb)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(usrmsg)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(usrmsg)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void writecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writecActionPerformed
        // TODO add your handling code here:
        int a=writec.getSelectedIndex();
        if(writec.getSelectedItem().toString().equals("Select")&&(!(readc.getSelectedItem().toString().equals("Select"))));
        else
        {   readc.setSelectedIndex(0);
            writec.setSelectedIndex(a);
        }    
    }//GEN-LAST:event_writecActionPerformed

    private void readcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readcActionPerformed
        // TODO add your handling code here:
         int a=readc.getSelectedIndex();
        if((readc.getSelectedItem().toString().equals("Select"))&& (!(writec.getSelectedItem().toString().equals("Select"))));
        else
        {   writec.setSelectedIndex(0);
            readc.setSelectedIndex(a);
        } 
    }//GEN-LAST:event_readcActionPerformed

    private void logoutbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbActionPerformed
        // TODO add your handling code here:
    	mains a=new mains();
		a.maing();
    	this.setVisible(false);
    	
    }//GEN-LAST:event_logoutbActionPerformed
    
    
    
    private void submitbActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	
    	String rt=readc.getItemAt(readc.getSelectedIndex());
    	String wt=writec.getItemAt(writec.getSelectedIndex());
    	System.out.println("write file is"+wt);
    	JOptionPane.showMessageDialog(this," read"+rt);
    	if(wt.equals("Select")&&rt.equals("Select")){
    		JOptionPane.showMessageDialog(this," select something");}
    	
    	
    	else if(!(rt.equals("Select")))
    	{
    		//do some thing
    		JOptionPane.showMessageDialog(this," read"+rt);

    		System.out.println("read file1 is"+rt);
    		//read rr=new read();
    		//rr.sst=rt;
    		//rr.maing();
    	//	rt="D:/JavaProject/MAC1/src/DataObjects/"+rt;
    		//rr.reads(rt);
    		//rr.maing();
    		
    		//read rr=new read();
    		//rt=rt.trim();
    		
    		//String ww=rt;
    		
    		//rr.maing(ww);
    		read rr=new read();
    		
    		rr.maing(rt);
    		this.setVisible(false);
    		
    	}
    	
    	else if(!(wt.equals("Select")))
    	{
    		
    		JOptionPane.showMessageDialog(this," write"+wt);
    		//write ww=new write();
    		//ww.sst=rt;
    		//ww.maing();
    		write ww=new write();
    		wt="D:/JavaProject/MAC2/src/DataObjects/"+wt;
    		ww.maing(wt);
    	this.setVisible(false);
    		
    		//do some thing
    	}
    		
    	
    	
    	
    	
    	
    	
    }
    

    public void submitbActionPerformeds() {//GEN-FIRST:event_submitbActionPerformed
        // TODO add your handling code here:
    	
    	
    	
    	
    	System.out.println("objects2 are "+ud);
    	System.out.println("objects3 are "+pd2);
    	try{
         	 Connection Con= DbConnection.GetDbConnection();
         	 JOptionPane.showMessageDialog(this," established");
         	Statement stmt = null;	 stmt = Con.createStatement();
         	
         	
         	
         	
         	String sql = "SELECT sub_id,sub_name,sub_sec_level FROM subject_clearence where sub_id='" +ud+"'";
            ResultSet rs = stmt.executeQuery(sql);
            //STEP 5: Extract data from result set
            //String ud="o";
            //String pd2="i";
            String ssl="o",subnm="o";
            //String 
            while(rs.next()){
               //Retrieve by column name
           	  subnm  = rs.getString("sub_name");
                 ssl = rs.getString("sub_sec_level");
               

               //Display values
               System.out.println("username: " + subnm);
               System.out.println("security level: " + ssl);
               
               
            }
            
            
            
            
            
            
            String ssc[]=new String[3];
            int i=0;//length of subject category level
            String sql1 = "SELECT sub_category FROM sub_cat where sub_id='" +ud+"'";
            ResultSet rs1 = stmt.executeQuery(sql1);
            //STEP 5: Extract data from result set
            //String ud="o";
            //String pd2="i";
           // String subcle="o",subnm="o";
            //String 
            System.out.println("seclevel is"+ssl);
            while(rs1.next()){
               //Retrieve by column name
           	  ssc[i] = rs1.getString("sub_category");
                 //subcle = rs.getString("sub_sec_level");
           	  i++;
               

               //Display values
              // System.out.println("userid: " + subnm);
              // System.out.println("passwd: " + subcle);
               
               
            }
            
            for(int j=0;j<i;j++){
            System.out.println("user category level of subject is: " + ssc[j]);
            
            }
            
            
            
            
            
           String[][] osl=new String[40][3];
           
            int i2=0;
            System.out.println("testing........."+ssl );
            String sql2 = "SELECT obj_id,obj_name,obj_seclevel FROM object_clearence";
            ResultSet rs2 = stmt.executeQuery(sql2);
            //STEP 5: Extract data from result set
            //String ud="o";
            //String pd2="i";
           // String subcle="o",subnm="o";
            //String 
            System.out.println("testing........."+ssl );
            while(rs2.next()){
               //Retrieve by column name
            	 System.out.println("testing........."+ssl );
           	  osl[i2][0] = rs2.getString("obj_id");
           	  osl[i2][1]=rs2.getString("obj_name");
           	  osl[i2][2]=rs2.getString("obj_seclevel");
                 //subcle = rs.getString("sub_sec_level");
           	  
               

               //Display values
              System.out.println("object id " + osl[i2][0]);
               System.out.println("object name  " + osl[i2][1]);
               System.out.println("obj security level: " + osl[i2][2]);
               i2++;
               
              }
            
            System.out.println("i2 is: " + i2);
            
            for(int j=0;j<i2;j++){
            
                System.out.println("object id is: " + osl[j][0]);
                System.out.println("object name is: " + osl[j][1]);
                System.out.println("object clearence is: " + osl[j][2]);
            	
                
                }
            
            
            
            
            
           // System.out.println("category level of subject is: " + i);
            
            for(int j=0;j<i2;j++){
            System.out.println("security level of object is: " + osl[j][0]);
            System.out.println("security level of object is: " + osl[j][1]);
            System.out.println("security level of object is: " + osl[j][2]);
            
            }
            
            
            
            
            
            
            String[][] onc=new String[40][3];
            
            int i3=0;
            System.out.println("testing........."+ssl );
            String sql3 = "SELECT obj_id,obj_category FROM obj_cat";
            ResultSet rs3 = stmt.executeQuery(sql3);
            //STEP 5: Extract data from result set
            //String ud="o";
            //String pd2="i";
           // String subcle="o",subnm="o";
            //String 
            System.out.println("testing........."+ssl );
            while(rs3.next()){
               //Retrieve by column name
            	 System.out.println("testing........."+ssl );
           	  onc[i3][0] = rs3.getString("obj_id");
           	  onc[i3][1]=rs3.getString("obj_category");
          // 	  onc[i3][2]=rs3.getString("obj_seclevel");
                 //subcle = rs.getString("sub_sec_level");
           	  
               

               //Display values
              System.out.println("userid: " + onc[i3][0]);
               System.out.println("passwd: " + onc[i3][1]);
               i3++;
               
              }
            
            System.out.println("i2 is: " + i3);
            
            for(int j=0;j<i3;j++){
            
                System.out.println("object id1 is: " + onc[j][0]);
                System.out.println("object name1 is: " + onc[j][1]);
               // System.out.println("object clearence1 is: " + onc[j][2]);
            	
                
                }
            
            
            for(int j=0;j<i;j++){
                System.out.println("user category level of subject is: " + ssc[j]);
                
                }
                
            
            
           // System.out.println("category level of subject is: " + i);
            for(int j=0;j<i2;j++){
                System.out.println("security level of object is: " + osl[j][0]);
                System.out.println("security level of object is: " + osl[j][1]);
                System.out.println("security level of object is: " + osl[j][2]);
                
                }
            
            
            
            for(int j=0;j<i3;j++){
            System.out.println("category level of object is: " + onc[j][0]);
            System.out.println("category level of object is: " + onc[j][1]);
            //System.out.println("category level of object is: " + osl[j][2]);
            
            }
            System.out.println("no of subject categories " + i);
            System.out.println("no of rows in object_clearence table " + i2);
            System.out.println("no of rows in obj_cat table " + i3); 
            
            
           //onc:object category 
            //osl:object sec level
            //ssc:sub category
            
            //tej code start
            
            //String ssl="unclassified",temp="null";
            //String[] ssc= {"navy","nato"};
            String[] t=new String[30];
            //String[][] osl={{"obj1","image","topsecret"},{"obj2","doc","confidential"},{"obj3","file3","unclassified"}};
            //String[][] onc={{"obj1","navy"},{"obj2","nato"},{"obj2","navy"},{"obj2","dream"},{"obj3","nato"},{"obj3","navy"}};
            int subsecvalue=0,objsecvalue=0,i5=0,j=0,count=0,k1=0;        

            if(ssl.equals("topsecret"))

            {
                subsecvalue = 4;
            }

            else if(ssl.equals("secret"))

            {
                subsecvalue = 3;
            }

            else if(ssl.equals("confidential"))

            {
                subsecvalue = 2;
            }

            else if(ssl.equals("unclassified"))

            {
                subsecvalue = 1;
            }

  
            for(k1=0;k1<i2;++k1)
        {
            count = 0;

            if(osl[k1][2].equals("topsecret"))

            {
            	
                objsecvalue = 4;

            }

            else if(osl[k1][2].equals("secret"))

            {
                objsecvalue = 3;
            }

            else if(osl[k1][2].equals("confidential"))

            {
                objsecvalue = 2;

            }

            else if(osl[k1][2].equals("unclassified"))

            {
                objsecvalue = 1;
            }

//            if(aces.equals("read"))

            {
                    if(subsecvalue>=objsecvalue)

                    {   
                        
                    	int c=0;
                        for(int m=0;m<i3;m++)
                        if(onc[m][0].equals(osl[k1][0]))
                        t[c++]=onc[m][1];
                        
                        
                        for(i5=0;i5<c;i5++)

                        {
                           
                            for(j=0;j<i;j++)

                            {
                                if(t[i5].equals(ssc[j]))

                                {
                                    count++;
                                    break;
                    
                                 }

                            }

                        }

                        if(count==i5)

                        {
                            //read given
                        	System.out.println(osl[k1][1]+" read");
                        	str1[u]=osl[k1][1];
                        	u++;
                       
                        }
                        else
                        {
                            //error  
                        	
                        }

                    }
                    
                    else

                    {
                        //error
                    }

            }
           
        }

         
       
            for(k1=0;k1<i2;++k1)
        {
            count = 0;

            if(osl[k1][2].equals("topsecret"))

            {
                objsecvalue = 4;
            }

            else if(osl[k1][2].equals("secret"))

            {
                objsecvalue = 3;
            }

            else if(osl[k1][2].equals("confidential"))

            {
                objsecvalue = 2;
            }

            else if(osl[k1][2].equals("unclassified"))

            {
                objsecvalue = 1;
            }


//            if(aces.equals("write"))

            {
                if(subsecvalue<=objsecvalue)

                {
                    for(i5=0;i5<i;i5++)

                    {

                        int c=0;
                        for(int m=0;m<i3;m++)
                        if(onc[m][0].equals(osl[k1][0]))
                        t[c++]=onc[m][1];

                        for(j=0;j<c;j++)

                        {                 
                            if(ssc[i5].equals(t[j]))

                            {
                                count++;
                                break;
                    
                            }

                         }

                    }

                    if(count==i5)

                    {
                        //write given
                    	System.out.println(osl[k1][1]+" write");
                    	str2[v]=osl[k1][1];
                    	v++;

                    }

                    else

                    {
                        //error

                    }

                }
                else
                {
                    //error   
                }
               
            }

        }
            
         for(int m=0;m<u;m++)
        	 System.out.print(str1[m]);
            
         System.out.print(" ");
         for(int m=0;m<v;m++)
        	 System.out.print(str2[m]);   
            
            
         for(int i30=0;i30<u;i30++)
             readc.addItem(str1[i30]);
         
         
         for(int i31=0;i31<v;i31++)
             writec.addItem(str2[i31]);
             //for(int i=0;i<u;i++)
               //  readc.addItem(str1[i]);
            
         
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            //tejcode end
            
            
            
         	
         	
         	
         	
         	
         	
         	 Con.close(); 
     	  }//end try
     catch(SQLException se){
         //Handle errors for JDBC
             se.printStackTrace();
          }
     	 catch(Exception ex)
     	 {
     	 }
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }//GEN-LAST:event_submitbActionPerformed

    private void readcFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_readcFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_readcFocusGained

    private void readcFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_readcFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_readcFocusLost

    private void writecFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_writecFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_writecFocusGained

    private void writecFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_writecFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_writecFocusLost

    /**
     * @param args the command line arguments
     */
    public static void maing(String ud,String pd2) {
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
            java.util.logging.Logger.getLogger(Userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Userpage().setVisible(true);
            	Userpage ss=new Userpage();
            	//up.submitbActionPerformeds();
            	ss.ud=ud;
            	ss.pd2=pd2;
            	ss.submitbActionPerformeds();
               ss.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutb;
    private javax.swing.JComboBox<String> readc;
    private javax.swing.JButton submitb;
    private javax.swing.JLabel usrmsg;
    private javax.swing.JComboBox<String> writec;
    // End of variables declaration//GEN-END:variables
}