package HospitalManagement;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import com.toedter.calendar.JDateChooser;

import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.RoundRectangle2D;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Queue;
import java.util.Random;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class HospitalManagement extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int password;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HospitalManagement frame = new HospitalManagement();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HospitalManagement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField Tname = new JTextField();
		Tname.setBounds(110, 363, 180, 26);
		
		contentPane.add(Tname);
		
		Tname.setColumns(10);
		
		JLabel lname = new JLabel("Name:");
		lname.setBounds(23, 364, 85, 25);
		lname.setFont(new Font("Constantia", Font.PLAIN, 18));
		contentPane.add(lname);
		
		JLabel lpassword = new JLabel("Password:");
		lpassword.setBounds(23, 408, 85, 25);
		lpassword.setFont(new Font("Constantia", Font.PLAIN, 18));
		contentPane.add(lpassword);
		
		JButton Breset = new RoundedButton("<html><div style='text-align: center;'>Reset</div></html>",new Color(42,115,141), 30);
		Breset.setBounds(110, 442, 70, 28);
		Breset.setFont(new Font("Constantia", Font.PLAIN, 17));
		Breset.setBorderPainted(true);
		Breset.setForeground(Color.WHITE);
		contentPane.add(Breset);
		
   		
		Breset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	Breset.setContentAreaFilled(true);
            	Breset.setBackground(new Color(0, 105, 184));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	Breset.setContentAreaFilled(false);
            	Breset.setBackground(new Color(42,115,141));
            }
        });
		
		JButton Blogin= new RoundedButton("<html><div style='text-align: center;'>Log in</div></html>",new Color(42,115,141), 30);
		Blogin.setBounds(219, 442, 70, 28);
		Blogin.setFont(new Font("Constantia", Font.PLAIN, 17));
		Blogin.setBorder(new RoundedBorder(20));
		Blogin.setForeground(Color.WHITE);
		contentPane.add(Blogin);
		
		Blogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	Blogin.setContentAreaFilled(true);
            	Blogin.setBackground(new Color(0, 105, 184));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	Blogin.setContentAreaFilled(false);
            	Blogin.setBackground(new Color(42,115,141));
            }
        });
		
		JPasswordField Tpassword = new JPasswordField();
		Tpassword.setBounds(110, 405, 180, 26);
		contentPane.add(Tpassword);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(0, 0, 769, 514);
		l1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\m.png"));
		contentPane.add(l1);
		
		setLocationRelativeTo(null);
		

		//Menu Frame
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		JFrame menu = new JFrame("Menu");
		menu.setBounds(0, 0, 1037, 650);
		menu.setLocationRelativeTo(null);
		
		menu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        menu.setResizable(false);

		ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\SecondMenu.png");
		JLabel menuIcon = new JLabel(icon);
		menuIcon.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		
		JPanel panel = new JPanel();
		panel.setBounds(210, 22, 790, 485);
		panel.setBackground(new Color(242,242,242));
		panel.setBorder(border);
		panel.setLayout(null);
		
		JLabel Lmenu = new JLabel("Management System");
		Lmenu.setBounds(30, 530, 450, 50);
		Lmenu.setFont(new Font("Times New Roman",Font.BOLD,42));
		Lmenu.setForeground(new Color(0,32,96));
        menuIcon.add(Lmenu);


        JButton BReception = new RoundedButton("Reception", new Color(0, 105, 184), 25);
        BReception.setBounds(13, 22, 170, 70);
        BReception.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
        BReception.setForeground(Color.WHITE);
        menuIcon.add(BReception);

        BReception.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                BReception.setContentAreaFilled(true);
                BReception.setBackground(new Color(0, 32, 96));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                BReception.setContentAreaFilled(false);
                BReception.setBackground(new Color(0, 105, 184));
            }
        });


        JButton BWorkers = new RoundedButton("Workers",new Color(0,105,184), 25);
        BWorkers.setBounds(13, 105, 170, 70);
        BWorkers.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
        BWorkers.setForeground(Color.WHITE);
        menuIcon.add(BWorkers);
        
        BWorkers.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	BWorkers.setContentAreaFilled(true);
            	BWorkers.setBackground(new Color(0, 32, 96));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	BWorkers.setContentAreaFilled(false);
            	BWorkers.setBackground(new Color(0, 105, 184));
            }
        });

        JButton BPatients = new RoundedButton("Patients",new Color(0,105,184), 25);
        BPatients.setBounds(13, 188, 170, 70);
        BPatients.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
        BPatients.setForeground(Color.WHITE);
        menuIcon.add(BPatients);
        
        BPatients.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	BPatients.setContentAreaFilled(true);
            	BPatients.setBackground(new Color(0, 32, 96));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	BPatients.setContentAreaFilled(false);
            	BPatients.setBackground(new Color(0, 105, 184));
            }
        });
        
        JButton BRooms = new RoundedButton("Rooms",new Color(0,105,184), 25);
        BRooms.setBounds(13, 271, 170, 70);
        BRooms.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
        BRooms.setForeground(Color.WHITE);
        menuIcon.add(BRooms);
        
        BRooms.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	BRooms.setContentAreaFilled(true);
            	BRooms.setBackground(new Color(0, 32, 96));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	BRooms.setContentAreaFilled(false);
            	BRooms.setBackground(new Color(0, 105, 184));
            }
        });
        
        JButton BServices = new RoundedButton("Services",new Color(0,105,184), 25);
        BServices.setBounds(13, 355, 170, 70);
        BServices.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
        BServices.setForeground(Color.WHITE);
        menuIcon.add(BServices);
        
        BServices.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	BServices.setContentAreaFilled(true);
            	BServices.setBackground(new Color(0, 32, 96));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	BServices.setContentAreaFilled(false);
            	BServices.setBackground(new Color(0, 105, 184));
            }
        });
        
        JButton BAppointment = new RoundedButton("Appointments",new Color(0,105,184), 25);
        BAppointment.setBounds(13, 437, 170, 70);
        BAppointment.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        BAppointment.setForeground(Color.WHITE);
        menuIcon.add(BAppointment);

        BAppointment.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	BAppointment.setContentAreaFilled(true);
            	BAppointment.setBackground(new Color(0, 32, 96));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	BAppointment.setContentAreaFilled(false);
            	BAppointment.setBackground(new Color(0, 105, 184));
            }
        });
        
        JButton BQueue = new RoundedButton("Queue",new Color(0,105,184), 25);
        BQueue.setBounds(859, 520, 140, 70);
        BQueue.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
        BQueue.setForeground(Color.WHITE);
        menuIcon.add(BQueue);

        BQueue.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            	BQueue.setContentAreaFilled(true);
            	BQueue.setBackground(new Color(0, 32, 96));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	BQueue.setContentAreaFilled(false);
            	BQueue.setBackground(new Color(0, 105, 184));
            }
        });
        
		menu.getContentPane().add(menuIcon);
		menuIcon.add(panel);

		menu.getContentPane().setLayout(null); 
		
		
	//All Frame Buttons	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		 JButton BRegisP = new RoundedButton("<html><div style='text-align: center;'>Registration<br>Patients</div></html>\"", new Color(42,115,141), 25);
	     BRegisP.setBounds(24, 20, 138, 67);
	     BRegisP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 19));
	     BRegisP.setForeground(Color.WHITE);
	     panel.add(BRegisP);
	     
	     BRegisP.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	         	BRegisP.setContentAreaFilled(true);
	         	BRegisP.setBackground(new Color(0, 47, 86));
	             
	         }

	         @Override
	         public void mouseExited(MouseEvent e) {
	         	BRegisP.setContentAreaFilled(false);
	         	BRegisP.setBackground(new Color(42,115,141));
	         }
	     });
	     
	     JButton BCreateAppointment = new RoundedButton("<html><div style='text-align: center;'>Create<br>Appointment</div></html>", new Color(42, 115, 141), 25);
	     BCreateAppointment.setBounds(175, 20, 145, 67);
	     BCreateAppointment.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 19));
	     BCreateAppointment.setForeground(Color.WHITE);
	     panel.add(BCreateAppointment);
	    
	     BCreateAppointment.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 BCreateAppointment.setContentAreaFilled(true);
	        	 BCreateAppointment.setBackground(new Color(0, 47, 86));
	             
	         }

	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 BCreateAppointment.setContentAreaFilled(false);
	        	 BCreateAppointment.setBackground(new Color(42,115,141));
	        	 
	        	 
	         }
	     });	
	     
	     
	     JButton BChiefP = new RoundedButton("<html><div style='text-align: center;'>Chief Physicians</div></html>", new Color(42,115,141), 25);
	     BChiefP .setBounds(24, 20, 138, 67);
	     BChiefP .setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
	     BChiefP .setForeground(Color.WHITE);
	     
	     
	     BChiefP .addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 BChiefP .setContentAreaFilled(true);
	        	 BChiefP .setBackground(new Color(0, 47, 86));
	             
	         }

	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 BChiefP .setContentAreaFilled(false);
	        	 BChiefP .setBackground(new Color(42,115,141));
	         }
	     });
	     
	     
	     
	     JButton BDoctors = new RoundedButton("Doctors", new Color(42,115,141), 25);
	     BDoctors.setBounds(175, 20, 138, 67);
	     BDoctors.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
	     BDoctors.setForeground(Color.WHITE);
	     
	     
	     BDoctors.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 BDoctors.setContentAreaFilled(true);
	        	 BDoctors.setBackground(new Color(0, 47, 86));
	             
	         }

	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 BDoctors.setContentAreaFilled(false);
	        	 BDoctors.setBackground(new Color(42,115,141));
	         }
	     });
	     
	     
	     JButton BDentists = new RoundedButton("Dentists", new Color(42,115,141), 25);
	     BDentists.setBounds(326, 20, 138, 67);
	     BDentists.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
	     BDentists.setForeground(Color.WHITE);
	     
	     
	     BDentists.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 BDentists.setContentAreaFilled(true);
	        	 BDentists.setBackground(new Color(0, 47, 86));
	             
	         }

	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 BDentists.setContentAreaFilled(false);
	        	 BDentists.setBackground(new Color(42,115,141));
	         }
	     });
	     
	     
	     
	     
	     JButton BNurses = new RoundedButton("Nurses", new Color(42,115,141), 25);
	     BNurses.setBounds(477, 20, 138, 67);
	     BNurses.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
	     BNurses.setForeground(Color.WHITE);
	     
	     
	     BNurses.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 BNurses.setContentAreaFilled(true);
	        	 BNurses.setBackground(new Color(0, 47, 86));
	             
	         }

	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 BNurses.setContentAreaFilled(false);
	        	 BNurses.setBackground(new Color(42,115,141));
	         }
	     });
	     
	     
	     
	     JButton BSecurity = new RoundedButton("Security", new Color(42,115,141), 25);
	     BSecurity.setBounds(628, 20, 138, 67);
	     BSecurity.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
	     BSecurity.setForeground(Color.WHITE);
	     
	     
	     BSecurity.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 BSecurity.setContentAreaFilled(true);
	        	 BSecurity.setBackground(new Color(0, 47, 86));
	             
	         }

	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 BSecurity.setContentAreaFilled(false);
	        	 BSecurity.setBackground(new Color(42,115,141));
	         }
	     });
	     
	     
	     
	     JButton BReceptionists = new RoundedButton("Receptionists", new Color(42,115,141), 25);
	     BReceptionists.setBounds(24, 102, 138, 67);
	     BReceptionists.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
	     BReceptionists.setForeground(Color.WHITE);
	     
	     
	     BReceptionists.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 BReceptionists.setContentAreaFilled(true);
	        	 BReceptionists.setBackground(new Color(0, 47, 86));
	             
	         }

	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 BReceptionists.setContentAreaFilled(false);
	        	 BReceptionists.setBackground(new Color(42,115,141));
	         }
	     });
	     
	     
	     
	     
	     JButton BHousekeepers = new RoundedButton("Housekeepers", new Color(42,115,141), 25);
	     BHousekeepers.setBounds(175, 105, 138, 67);
	     BHousekeepers.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
	     BHousekeepers.setForeground(Color.WHITE);
	     
	     
	     BHousekeepers.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 BHousekeepers.setContentAreaFilled(true);
	        	 BHousekeepers.setBackground(new Color(0, 47, 86));
	             
	         }

	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 BHousekeepers.setContentAreaFilled(false);
	        	 BHousekeepers.setBackground(new Color(42,115,141));
	         }
	     });
	     
	     
	     JButton BAddWorker = new RoundedButton("Add Worker", new Color(42,115,141), 25);
	     BAddWorker.setBounds(326, 105, 138, 67);
	     BAddWorker.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 19));
	     BAddWorker.setForeground(Color.WHITE);
	     
	     
	     BAddWorker.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 BAddWorker.setContentAreaFilled(true);
	        	 BAddWorker.setBackground(new Color(0, 47, 86));
	             
	         }

	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 BAddWorker.setContentAreaFilled(false);
	        	 BAddWorker.setBackground(new Color(42,115,141));
	         }
	     });
	        	 
	        	 JButton BBedP = new RoundedButton("<html><div style='text-align: center;'>Bed Patients</div></html>", new Color(42,115,141), 25);
	   		     BBedP.setBounds(24, 20, 138, 67);
	   		     BBedP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
	   		     BBedP.setForeground(Color.WHITE);
	   		     
	   		     
	   		      BBedP.addMouseListener(new MouseAdapter() {
	   		         @Override
	   		         public void mouseEntered(MouseEvent e) {
	   		        	BBedP.setContentAreaFilled(true);
	   		        	BBedP.setBackground(new Color(0, 47, 86));
	   		             
	   		         }

	   		         @Override
	   		         public void mouseExited(MouseEvent e) {
	   		        	BBedP.setContentAreaFilled(false);
	   		        	BBedP.setBackground(new Color(42,115,141));
	   		         }
	   		     });
	   		     
	   		     
	   		     
	   		     JButton BInfectiousP = new RoundedButton("<html><div style='text-align: center;'>Infectious<br>Patients</div></html>", new Color(42,115,141), 25);
	   		     BInfectiousP.setBounds(175, 20, 138, 67);
	   		     BInfectiousP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
	   		     BInfectiousP.setForeground(Color.WHITE);
	   		     
	   		     
	   		  BInfectiousP.addMouseListener(new MouseAdapter() {
	   		         @Override
	   		         public void mouseEntered(MouseEvent e) {
	   		        	BInfectiousP.setContentAreaFilled(true);
	   		        	BInfectiousP.setBackground(new Color(0, 47, 86));
	   		             
	   		         }

	   		         @Override
	   		         public void mouseExited(MouseEvent e) {
	   		        	BInfectiousP.setContentAreaFilled(false);
	   		        	BInfectiousP.setBackground(new Color(42,115,141));
	   		         }
	   		     });
	   		     
	   		     
	   		     JButton BChronicP = new RoundedButton("<html><div style='text-align: center;'>Chronic<br>Patients</div></html>", new Color(42,115,141), 25);
	   		     BChronicP.setBounds(326, 20, 138, 67);
	   		     BChronicP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
	   		     BChronicP.setForeground(Color.WHITE);
	   		  
	   		     
	   		  BChronicP.addMouseListener(new MouseAdapter() {
	   		         @Override
	   		         public void mouseEntered(MouseEvent e) {
	   		        	BChronicP.setContentAreaFilled(true);
	   		        	BChronicP.setBackground(new Color(0, 47, 86));
	   		             
	   		         }

	   		         @Override
	   		         public void mouseExited(MouseEvent e) {
	   		        	BChronicP.setContentAreaFilled(false);
	   		        	BChronicP.setBackground(new Color(42,115,141));
	   		         }
	   		     });
	   		     
	   		     
	   		     
	   		     
	   		     JButton BGeneticP = new RoundedButton("<html><div style='text-align: center;'>Genetic<br>Patients</div></html>", new Color(42,115,141), 25);
	   		     BGeneticP.setBounds(477, 20, 138, 67);
	   		     BGeneticP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
	   		     BGeneticP.setForeground(Color.WHITE);
	   		    
	   		     
	   		  BGeneticP.addMouseListener(new MouseAdapter() {
	   		         @Override
	   		         public void mouseEntered(MouseEvent e) {
	   		        	BGeneticP.setContentAreaFilled(true);
	   		        	BGeneticP.setBackground(new Color(0, 47, 86));
	   		             
	   		         }

	   		         @Override
	   		         public void mouseExited(MouseEvent e) {
	   		        	BGeneticP.setContentAreaFilled(false);
	   		        	BGeneticP.setBackground(new Color(42,115,141));
	   		         }
	   		     });
	   		     
	   		     
	   		     
	   		     JButton BCancerP = new RoundedButton("<html><div style='text-align: center;'>Cancer<br>Patients</div></html>", new Color(42,115,141), 25);
	   		     BCancerP.setBounds(628, 20, 138, 67);
	   		     BCancerP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
	   		     BCancerP.setForeground(Color.WHITE);
	   		     
	   		     
	   		  BCancerP.addMouseListener(new MouseAdapter() {
	   		         @Override
	   		         public void mouseEntered(MouseEvent e) {
	   		        	BCancerP.setContentAreaFilled(true);
	   		        	BCancerP.setBackground(new Color(0, 47, 86));
	   		             
	   		         }

	   		         @Override
	   		         public void mouseExited(MouseEvent e) {
	   		        	BCancerP.setContentAreaFilled(false);
	   		        	BCancerP.setBackground(new Color(42,115,141));
	   		         }
	   		     });
	   		     
	   		     
	   		     
	   		     JButton BRespiratoryP = new RoundedButton("<html><div style='text-align: center;'>Respiratory<br>Patients</div></html>", new Color(42,115,141), 25);
	   		     BRespiratoryP.setBounds(24, 102, 138, 67);
	   		     BRespiratoryP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
	   		     BRespiratoryP.setForeground(Color.WHITE);
	   		     
	   		     
	   		  BRespiratoryP.addMouseListener(new MouseAdapter() {
	   		         @Override
	   		         public void mouseEntered(MouseEvent e) {
	   		        	BRespiratoryP.setContentAreaFilled(true);
	   		        	BRespiratoryP.setBackground(new Color(0, 47, 86));
	   		             
	   		         }

	   		         @Override
	   		         public void mouseExited(MouseEvent e) {
	   		        	BRespiratoryP.setContentAreaFilled(false);
	   		        	BRespiratoryP.setBackground(new Color(42,115,141));
	   		         }
	   		     });
	   		     
	   		     
	   		     
	   		     
	   		     JButton BEndocrineP = new RoundedButton("<html><div style='text-align: center;'>Endocrine<br>Patients</div></html>", new Color(42,115,141), 25);
	   		     BEndocrineP.setBounds(175, 105, 138, 67);
	   		     BEndocrineP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
	   		     BEndocrineP.setForeground(Color.WHITE);
	   		     
	   		     
	   		   BEndocrineP.addMouseListener(new MouseAdapter() {
	   		         @Override
	   		         public void mouseEntered(MouseEvent e) {
	   		        	BEndocrineP.setContentAreaFilled(true);
	   		        	BEndocrineP.setBackground(new Color(0, 47, 86));
	   		             
	   		         }

	   		         @Override
	   		         public void mouseExited(MouseEvent e) {
	   		        	BEndocrineP.setContentAreaFilled(false);
	   		        	BEndocrineP.setBackground(new Color(42,115,141));
	   		         }
	   		     });
	   		     
	   		     
	   		     JButton BNeuroP = new RoundedButton("<html><div style='text-align: center;'>Neurological<br>Patients</div></html>", new Color(42,115,141), 25);
	   		     BNeuroP.setBounds(326, 105, 138, 67);
	   	       	 BNeuroP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 19));
	   		     BNeuroP.setForeground(Color.WHITE);
	   		     
	   		     
	   		  BNeuroP.addMouseListener(new MouseAdapter() {
	   		         @Override
	   		         public void mouseEntered(MouseEvent e) {
	   		        	BNeuroP.setContentAreaFilled(true);
	   		        	BNeuroP.setBackground(new Color(0, 47, 86));
	   		             
	   		         }

	   		         @Override
	   		         public void mouseExited(MouseEvent e) {
	   		        	BNeuroP.setContentAreaFilled(false);
	   		        	BNeuroP.setBackground(new Color(42,115,141));
	   		        	 
	   		     
	   		        	
	   		        	
	   		         }
	   		     });
	   		  
	   		  
	   		  
	   		 JButton BSkinP = new RoundedButton("<html><div style='text-align: center;'>Skin<br>Patients</div></html>", new Color(42,115,141), 25);
	   		 BSkinP.setBounds(477, 105, 138, 67);
	   		 BSkinP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
	   		 BSkinP.setForeground(Color.WHITE);
   		     
   		     
   		  BSkinP.addMouseListener(new MouseAdapter() {
   		         @Override
   		         public void mouseEntered(MouseEvent e) {
   		        	BSkinP.setContentAreaFilled(true);
   		        	BSkinP.setBackground(new Color(0, 47, 86));
   		             
   		         }

   		         @Override
   		         public void mouseExited(MouseEvent e) {
   		        	BSkinP.setContentAreaFilled(false);
   		        	BSkinP.setBackground(new Color(42,115,141));
   		         }
   		     });
   		     
   		     
   		     JButton BMentalP = new RoundedButton("<html><div style='text-align: center;'>Mental<br>Patients</div></html>", new Color(42,115,141), 25);
   		     BMentalP.setBounds(628, 105, 138, 67);
   		     BMentalP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
   		     BMentalP.setForeground(Color.WHITE);
   		     
   		     
   		  BMentalP.addMouseListener(new MouseAdapter() {
   		         @Override
   		         public void mouseEntered(MouseEvent e) {
   		        	BMentalP.setContentAreaFilled(true);
   		        	BMentalP.setBackground(new Color(0, 47, 86));
   		             
   		         }

   		         @Override
   		         public void mouseExited(MouseEvent e) {
   		        	BMentalP.setContentAreaFilled(false);
   		        	BMentalP.setBackground(new Color(42,115,141));
   		        	 
   		     
   		        	
   		        	
   		         }
   		     });
	   		     
	   		    
   		  
   		 JButton BPatientsR = new RoundedButton("<html><div style='text-align: center;'>Patients<br>Rooms</div></html>", new Color(42,115,141), 25);
		     BPatientsR.setBounds(24, 20, 138, 67);
		     BPatientsR.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		     BPatientsR.setForeground(Color.WHITE);
		     
		     
		  BPatientsR.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseEntered(MouseEvent e) {
		        	BPatientsR.setContentAreaFilled(true);
		        	BPatientsR.setBackground(new Color(0, 47, 86));
		             
		         }

		         @Override
		         public void mouseExited(MouseEvent e) {
		        	BPatientsR.setContentAreaFilled(false);
		        	BPatientsR.setBackground(new Color(42,115,141));
		         }
		     });
		     
		     
		     
		     JButton BStaffR = new RoundedButton("<html><div style='text-align: center;'>Staff<br>Rooms</div></html>", new Color(42,115,141), 25);
		     BStaffR.setBounds(175, 20, 138, 67);
		     BStaffR.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		     BStaffR.setForeground(Color.WHITE);
		     
		     
		  BStaffR.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseEntered(MouseEvent e) {
		        	BStaffR.setContentAreaFilled(true);
		        	BStaffR.setBackground(new Color(0, 47, 86));
		             
		         }

		         @Override
		         public void mouseExited(MouseEvent e) {
		        	BStaffR.setContentAreaFilled(false);
		        	BStaffR.setBackground(new Color(42,115,141));
		         }
		     });
		     
		     
		     JButton BSurgeryR = new RoundedButton("<html><div style='text-align: center;'>Surgery<br>Rooms</div></html>", new Color(42,115,141), 25);
		     BSurgeryR.setBounds(326, 20, 138, 67);
		     BSurgeryR.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		     BSurgeryR.setForeground(Color.WHITE);
		     
		     
		  BSurgeryR.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseEntered(MouseEvent e) {
		        	BSurgeryR.setContentAreaFilled(true);
		        	BSurgeryR.setBackground(new Color(0, 47, 86));
		             
		         }

		         @Override
		         public void mouseExited(MouseEvent e) {
		        	BSurgeryR.setContentAreaFilled(false);
		        	BSurgeryR.setBackground(new Color(42,115,141));
		         }
		     });
		     
		     
		     
		     
		     JButton BDiagnosticR = new RoundedButton("<html><div style='text-align: center;'>Diagnostic<br>Rooms</div></html>", new Color(42,115,141), 25);
		     BDiagnosticR.setBounds(477, 20, 138, 67);
		     BDiagnosticR.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		     BDiagnosticR.setForeground(Color.WHITE);
		     
		     
		  BDiagnosticR.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseEntered(MouseEvent e) {
		        	BDiagnosticR.setContentAreaFilled(true);
		        	BDiagnosticR.setBackground(new Color(0, 47, 86));
		             
		         }

		         @Override
		         public void mouseExited(MouseEvent e) {
		        	BDiagnosticR.setContentAreaFilled(false);
		        	BDiagnosticR.setBackground(new Color(42,115,141));
		         }
		     });
		     
		     
		     
		     JButton BXrayR = new RoundedButton("<html><div style='text-align: center;'>X-Ray<br>Rooms</div></html>", new Color(42,115,141), 25);
		     BXrayR.setBounds(628, 20, 138, 67);
		     BXrayR.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		     BXrayR.setForeground(Color.WHITE);
		     
		     
		  BXrayR.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseEntered(MouseEvent e) {
		        	BXrayR.setContentAreaFilled(true);
		        	BXrayR.setBackground(new Color(0, 47, 86));
		             
		         }

		         @Override
		         public void mouseExited(MouseEvent e) {
		        	BXrayR.setContentAreaFilled(false);
		        	BXrayR.setBackground(new Color(42,115,141));
		         }
		     });
		  
		  
		  JButton BLaboratoryS = new RoundedButton("<html><div style='text-align: center;'>Laboratory</div></html>", new Color(42,115,141), 25);
		     BLaboratoryS.setBounds(24, 20, 138, 67);
		     BLaboratoryS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		     BLaboratoryS.setForeground(Color.WHITE);
		     
		     
		  BLaboratoryS.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseEntered(MouseEvent e) {
		        	BLaboratoryS.setContentAreaFilled(true);
		        	BLaboratoryS.setBackground(new Color(0, 47, 86));
		             
		         }

		         @Override
		         public void mouseExited(MouseEvent e) {
		        	BLaboratoryS.setContentAreaFilled(false);
		        	BLaboratoryS.setBackground(new Color(42,115,141));
		         }
		     });
		     
		     
		     
		     JButton BUrologyS = new RoundedButton("<html><div style='text-align: center;'>Urology</div></html>", new Color(42,115,141), 25);
		     BUrologyS.setBounds(175, 20, 138, 67);
		     BUrologyS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		     BUrologyS.setForeground(Color.WHITE);
		     
		     
		  BUrologyS.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseEntered(MouseEvent e) {
		        	BUrologyS.setContentAreaFilled(true);
		        	BUrologyS.setBackground(new Color(0, 47, 86));
		             
		         }

		         @Override
		         public void mouseExited(MouseEvent e) {
		        	BUrologyS.setContentAreaFilled(false);
		        	BUrologyS.setBackground(new Color(42,115,141));
		         }
		     });
		     
		     
		     JButton BDentistryS = new RoundedButton("<html><div style='text-align: center;'>Dentistry</div></html>", new Color(42,115,141), 25);
		     BDentistryS.setBounds(326, 20, 138, 67);
		     BDentistryS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		     BDentistryS.setForeground(Color.WHITE);
		     
		     
		  BDentistryS.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseEntered(MouseEvent e) {
		        	BDentistryS.setContentAreaFilled(true);
		        	BDentistryS.setBackground(new Color(0, 47, 86));
		             
		         }

		         @Override
		         public void mouseExited(MouseEvent e) {
		        	BDentistryS.setContentAreaFilled(false);
		        	BDentistryS.setBackground(new Color(42,115,141));
		         }
		     });
		     
		     
		     
		     
		     JButton BPediatricS = new RoundedButton("<html><div style='text-align: center;'>Pediatrics</div></html>", new Color(42,115,141), 25);
		     BPediatricS.setBounds(477, 20, 138, 67);
		     BPediatricS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		     BPediatricS.setForeground(Color.WHITE);
		     
		     
		  BPediatricS.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseEntered(MouseEvent e) {
		        	BPediatricS.setContentAreaFilled(true);
		        	BPediatricS.setBackground(new Color(0, 47, 86));
		             
		         }

		         @Override
		         public void mouseExited(MouseEvent e) {
		        	BPediatricS.setContentAreaFilled(false);
		        	BPediatricS.setBackground(new Color(42,115,141));
		         }
		     });
		     
		     
		     
		     JButton BTherapyS = new RoundedButton("<html><div style='text-align: center;'>Therapy</div></html>", new Color(42,115,141), 25);
		     BTherapyS.setBounds(628, 20, 138, 67);
		     BTherapyS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		     BTherapyS.setForeground(Color.WHITE);
		     
		     
		  BTherapyS.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseEntered(MouseEvent e) {
		        	BTherapyS.setContentAreaFilled(true);
		        	BTherapyS.setBackground(new Color(0, 47, 86));
		             
		         }

		         @Override
		         public void mouseExited(MouseEvent e) {
		        	BTherapyS.setContentAreaFilled(false);
		        	BTherapyS.setBackground(new Color(42,115,141));
		         }
		     });
		     
		     
		     
		     JButton BReanimationS = new RoundedButton("<html><div style='text-align: center;'>Reanimation</div></html>", new Color(42,115,141), 25);
		     BReanimationS.setBounds(24, 102, 138, 67);
		     BReanimationS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 19));
		     BReanimationS.setForeground(Color.WHITE);
		     
		     
		  BReanimationS.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseEntered(MouseEvent e) {
		        	BReanimationS.setContentAreaFilled(true);
		        	BReanimationS.setBackground(new Color(0, 47, 86));
		             
		         }

		         @Override
		         public void mouseExited(MouseEvent e) {
		        	BReanimationS.setContentAreaFilled(false);
		        	BReanimationS.setBackground(new Color(42,115,141));
		         }
		     });
		     
		     
		     
		     
		     JButton BGenSurgS = new RoundedButton("<html><div style='text-align: center;'>General<br>Surgery</div></html>", new Color(42,115,141), 25);
		     BGenSurgS.setBounds(175, 105, 138, 67);
		     BGenSurgS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		     BGenSurgS.setForeground(Color.WHITE);
		     
		     
		  BGenSurgS.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseEntered(MouseEvent e) {
		        	BGenSurgS.setContentAreaFilled(true);
		        	BGenSurgS.setBackground(new Color(0, 47, 86));
		             
		         }

		         @Override
		         public void mouseExited(MouseEvent e) {
		        	BGenSurgS.setContentAreaFilled(false);
		        	BGenSurgS.setBackground(new Color(42,115,141));
		         }
		     });
		     
		     
		     JButton BAmbulanceS = new RoundedButton("<html><div style='text-align: center;'>Ambulance</div></html>", new Color(42,115,141), 25);
		     BAmbulanceS.setBounds(326, 105, 138, 67);
		     BAmbulanceS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
		     BAmbulanceS.setForeground(Color.WHITE);
		     
		     
		     
		  BAmbulanceS.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseEntered(MouseEvent e) {
		        	BAmbulanceS.setContentAreaFilled(true);
		        	BAmbulanceS.setBackground(new Color(0, 47, 86));
		             
		         }

		         @Override
		         public void mouseExited(MouseEvent e) {
		        	BAmbulanceS.setContentAreaFilled(false);
		        	BAmbulanceS.setBackground(new Color(42,115,141));
		        	
		         }
  		});
		
	 //Reception features
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			 BReception.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					
					panel.add(BRegisP);
					panel.add(BCreateAppointment);
					
					panel.remove(BChiefP);
					panel.remove(BDoctors);
					panel.remove(BDentists);
					panel.remove(BNurses);
					panel.remove(BSecurity);
					panel.remove(BReceptionists);
					panel.remove(BHousekeepers);
					panel.remove(BAddWorker);
					
					panel.remove(BBedP);
					panel.remove(BInfectiousP);
					panel.remove(BChronicP);
					panel.remove(BGeneticP);
					panel.remove(BCancerP);
					panel.remove(BRespiratoryP);
					panel.remove(BEndocrineP);
					panel.remove(BNeuroP);
					panel.remove(BSkinP);
					panel.remove(BMentalP);
					
					panel.remove(BPatientsR);
					panel.remove(BStaffR);
					panel.remove(BSurgeryR);
					panel.remove(BDiagnosticR);
					panel.remove(BXrayR);
					
					panel.remove(BLaboratoryS);
					panel.remove(BUrologyS);
					panel.remove(BDentistryS);
					panel.remove(BPediatricS);
					panel.remove(BTherapyS);
					panel.remove(BReanimationS);
					panel.remove(BGenSurgS);
					panel.remove(BAmbulanceS);
					
					panel.revalidate();
					panel.repaint();
					
				}
				 
			 });
		   
			 
	        
	           
		     
	  //Workers     
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		     BWorkers.addActionListener(new ActionListener() {
	      		   
	        		public void actionPerformed(ActionEvent e) {
	        			
	        			
	        			panel.add(BChiefP);
						panel.add(BDoctors);
						panel.add(BDentists);
						panel.add(BNurses);
						panel.add(BSecurity);
						panel.add(BReceptionists);
						panel.add(BHousekeepers);
						panel.add(BAddWorker);
		    
	        			panel.remove(BRegisP);
						panel.remove(BCreateAppointment);
						
						panel.remove(BBedP);
						panel.remove(BInfectiousP);
						panel.remove(BChronicP);
						panel.remove(BGeneticP);
						panel.remove(BCancerP);
						panel.remove(BRespiratoryP);
						panel.remove(BEndocrineP);
						panel.remove(BNeuroP);
						panel.remove(BSkinP);
						panel.remove(BMentalP);
						
						panel.remove(BPatientsR);
						panel.remove(BStaffR);
						panel.remove(BSurgeryR);
						panel.remove(BDiagnosticR);
						panel.remove(BXrayR);
						
						panel.remove(BLaboratoryS);
						panel.remove(BUrologyS);
						panel.remove(BDentistryS);
						panel.remove(BPediatricS);
						panel.remove(BTherapyS);
						panel.remove(BReanimationS);
						panel.remove(BGenSurgS);
						panel.remove(BAmbulanceS);
						
						panel.revalidate();
						panel.repaint();
		    
		        	 
		         }
		     });
		     
		        
		     
		     
	 //Patients     
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		   		     BPatients.addActionListener(new ActionListener() {
		   	      		   
		   	        		public void actionPerformed(ActionEvent e) {
		   	        			
		   	        			panel.add(BBedP);
								panel.add(BInfectiousP);
								panel.add(BChronicP);
								panel.add(BGeneticP);
								panel.add(BCancerP);
								panel.add(BRespiratoryP);
								panel.add(BEndocrineP);
								panel.add(BNeuroP);
								panel.add(BSkinP);
								panel.add(BMentalP);
		   	        			
		   	        			panel.remove(BRegisP);
								panel.remove(BCreateAppointment);
								
		   	        			panel.remove(BChiefP);
								panel.remove(BDoctors);
								panel.remove(BDentists);
								panel.remove(BNurses);
								panel.remove(BSecurity);
								panel.remove(BReceptionists);
								panel.remove(BHousekeepers);
								panel.remove(BAddWorker);
								
								panel.remove(BPatientsR);
								panel.remove(BStaffR);
								panel.remove(BSurgeryR);
								panel.remove(BDiagnosticR);
								panel.remove(BXrayR);
								
								panel.remove(BLaboratoryS);
								panel.remove(BUrologyS);
								panel.remove(BDentistryS);
								panel.remove(BPediatricS);
								panel.remove(BTherapyS);
								panel.remove(BReanimationS);
								panel.remove(BGenSurgS);
								panel.remove(BAmbulanceS);
								
								panel.revalidate();
								panel.repaint();
		   		    
		   	        			
		   	        		}
		   		     });
		   		     
		   		     
		   		 
	
		//Rooms   		     
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------		   		     
		   		     
		   		  BRooms.addActionListener(new ActionListener() {
	   	      		   
	   	        		public void actionPerformed(ActionEvent e) {
	   	        			
	   	        	    
	   	        			panel.add(BPatientsR);
	   						panel.add(BStaffR);
	   						panel.add(BSurgeryR);
	   						panel.add(BDiagnosticR);
	   						panel.add(BXrayR);
	   	        			
	   	        			panel.remove(BRegisP);
	   						panel.remove(BCreateAppointment);
	   						
	   						panel.remove(BChiefP);
	   						panel.remove(BDoctors);
	   						panel.remove(BDentists);
	   						panel.remove(BNurses);
	   						panel.remove(BSecurity);
	   						panel.remove(BReceptionists);
	   						panel.remove(BHousekeepers);
	   						panel.remove(BAddWorker);
	   						
	   						panel.remove(BBedP);
	   						panel.remove(BInfectiousP);
	   						panel.remove(BChronicP);
	   						panel.remove(BGeneticP);
	   						panel.remove(BCancerP);
	   						panel.remove(BRespiratoryP);
	   						panel.remove(BEndocrineP);
	   						panel.remove(BNeuroP);
	   						panel.remove(BSkinP);
	   						panel.remove(BMentalP);
	   						
	   						panel.remove(BLaboratoryS);
	   						panel.remove(BUrologyS);
	   						panel.remove(BDentistryS);
	   						panel.remove(BPediatricS);
	   						panel.remove(BTherapyS);
	   						panel.remove(BReanimationS);
	   						panel.remove(BGenSurgS);
	   						panel.remove(BAmbulanceS);
	   						
	   						panel.revalidate();
							panel.repaint();
	   	        
	        		       
	        		    }
	        		});
		   		  
		//Services   		  
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------		   		  
		   		 BServices.addActionListener(new ActionListener() {
	   	      		   
	   	        		public void actionPerformed(ActionEvent e) {
	   	        	   
	   	        			panel.add(BLaboratoryS);
	   						panel.add(BUrologyS);
	   						panel.add(BDentistryS);
	   						panel.add(BPediatricS);
	   						panel.add(BTherapyS);
	   						panel.add(BReanimationS);
	   						panel.add(BGenSurgS);
	   						panel.add(BAmbulanceS);
	   		    
	   	        			panel.remove(BPatientsR);
	   						panel.remove(BStaffR);
	   						panel.remove(BSurgeryR);
	   						panel.remove(BDiagnosticR);
	   						panel.remove(BXrayR);
	   	        			
	   	        			panel.remove(BRegisP);
	   						panel.remove(BCreateAppointment);
	   						
	   						panel.remove(BChiefP);
	   						panel.remove(BDoctors);
	   						panel.remove(BDentists);
	   						panel.remove(BNurses);
	   						panel.remove(BSecurity);
	   						panel.remove(BReceptionists);
	   						panel.remove(BHousekeepers);
	   						panel.remove(BAddWorker);
	   						
	   						panel.remove(BBedP);
	   						panel.remove(BInfectiousP);
	   						panel.remove(BChronicP);
	   						panel.remove(BGeneticP);
	   						panel.remove(BCancerP);
	   						panel.remove(BRespiratoryP);
	   						panel.remove(BEndocrineP);
	   						panel.remove(BNeuroP);
	   						panel.remove(BSkinP);
	   						panel.remove(BMentalP);
	   					 
	   						panel.revalidate();
							panel.repaint();
	   		     
	   		         }
	   		     });   
		   		
		  //Appointment 		 
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		   		
	    
		   		DefaultTableModel Amodel1 = new DefaultTableModel();
				Amodel1.addColumn("ID");
				Amodel1.addColumn("Name");
				Amodel1.addColumn("Surname");
				Amodel1.addColumn("Gender");
				Amodel1.addColumn("Number");
				Amodel1.addColumn("E-mail");
				Amodel1.addColumn("Date of Appointment");
				Amodel1.addColumn("Doctor Name");
		   		
		   		BAppointment.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FAppointment = new JFrame();
				FAppointment.setBounds(0, 0, 830, 572);
				FAppointment.getContentPane().setBackground(new Color(242,242,242));
				FAppointment.setLocationRelativeTo(FAppointment);
				FAppointment.setVisible(true);
				FAppointment.setResizable(false);
				
				JTable TAppointments = new JTable(Amodel1);
				TAppointments.setBounds(9, 55, 796, 387);
				
				
				TAppointments.getColumnModel().getColumn(0).setPreferredWidth(25);
				TAppointments.getColumnModel().getColumn(1).setPreferredWidth(87);
				TAppointments.getColumnModel().getColumn(2).setPreferredWidth(102);
				TAppointments.getColumnModel().getColumn(3).setPreferredWidth(87);
				TAppointments.getColumnModel().getColumn(4).setPreferredWidth(97);
				TAppointments.getColumnModel().getColumn(5).setPreferredWidth(167);
				TAppointments.getColumnModel().getColumn(6).setPreferredWidth(125);
				TAppointments.getColumnModel().getColumn(7).setPreferredWidth(103);
				
				
				TAppointments.getTableHeader().setResizingAllowed(false);
				TAppointments.setDefaultEditor(Object.class, null);
				
				
				    TAppointments.getTableHeader().setBackground(new Color(189,215,238));
		            TAppointments.getTableHeader().setForeground(Color.BLACK);
			        TAppointments.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane As1 = new JScrollPane(TAppointments);
			        As1.setBounds(9, 55, 796, 385);
			        As1.setBorder(border);
			        As1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuAppoint = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuAppoint.setBounds(360, 463, 93, 46);
			        MenuAppoint.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuAppoint.setForeground(Color.WHITE);
			        
			        JLabel LAppointment = new JLabel("Appointments");
			        LAppointment.setBounds(330, 10, 154, 30);
			        LAppointment.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LAppointment.setForeground(Color.BLACK);
			        
			        JLabel Apattern1 = new JLabel();
			        Apattern1.setBounds(103, 446, 350,80);
			        Apattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel Apattern2 = new JLabel();
			        Apattern2.setBounds(460, 446, 350,80);
			        Apattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel Apattern3 = new JLabel();
			        Apattern3.setBounds(175, 5, 152,47);
			        Apattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel Apattern4 = new JLabel();
			        Apattern4.setBounds(485, 5, 152,47);
			        Apattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuAppoint.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FAppointment.dispose();
							
						}
			        	
			        });
			        
					
			        
			    FAppointment.setLayout(null);
			    FAppointment.add(As1);
				FAppointment.add(MenuAppoint);
				FAppointment.add(Apattern1);
				FAppointment.add(Apattern2);
				FAppointment.add(Apattern3);
				FAppointment.add(Apattern4);
				FAppointment.add(LAppointment);
			
			}
	    	
	    });       
	        
	    
	   //Queue
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	        		   
	    BQueue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FQueue = new JFrame();
				FQueue.setBounds(0, 0, 830, 572);
				FQueue.getContentPane().setBackground(new Color(242,242,242));
				FQueue.setLocationRelativeTo(FQueue);
				FQueue.setVisible(true);
				FQueue.setResizable(false);
				
				DefaultTableModel Qmodel1 = new DefaultTableModel();
				Qmodel1.addColumn("ID");
				Qmodel1.addColumn("Name");
				Qmodel1.addColumn("Surname");
				Qmodel1.addColumn("Desk");
				Qmodel1.addColumn("Queue Number");
				
				
				
				JTable TQueue = new JTable(Qmodel1);
				TQueue.setBounds(9, 134, 796, 306);
				
				
				TQueue.getColumnModel().getColumn(0).setPreferredWidth(28);
				TQueue.getColumnModel().getColumn(1).setPreferredWidth(193);
				TQueue.getColumnModel().getColumn(2).setPreferredWidth(193);
				TQueue.getColumnModel().getColumn(3).setPreferredWidth(193);
				TQueue.getColumnModel().getColumn(4).setPreferredWidth(193);
				
				
				
				    TQueue.getTableHeader().setResizingAllowed(false);
				    TQueue.setDefaultEditor(Object.class, null);
				
				
				    TQueue.getTableHeader().setBackground(new Color(189,215,238));
				    TQueue.getTableHeader().setForeground(Color.BLACK);
		            TQueue.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane Qs1 = new JScrollPane(TQueue);
			        Qs1.setBounds(9, 134, 796, 306);
			        Qs1.setBorder(border);
			        Qs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuQueue = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuQueue.setBounds(360, 463, 93, 46);
			        MenuQueue.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuQueue.setForeground(Color.WHITE);
			        
			        JLabel LQueue = new JLabel("Queue");
			        LQueue.setBounds(371, 10, 72, 30);
			        LQueue.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LQueue.setForeground(Color.BLACK);
			        
			        JLabel Qpattern1 = new JLabel();
			        Qpattern1.setBounds(103, 446, 350,80);
			        Qpattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel Qpattern2 = new JLabel();
			        Qpattern2.setBounds(460, 446, 350,80);
			        Qpattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel Qpattern3 = new JLabel();
			        Qpattern3.setBounds(213, 5, 152,47);
			        Qpattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel Qpattern4 = new JLabel();
			        Qpattern4.setBounds(447, 5, 152,47);
			        Qpattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        JLabel QName = new JLabel("Name:");
			        QName.setBounds(30, 63, 50, 17);
			        QName.setForeground(Color.BLACK);
			        QName.setFont(new Font("Calibri", Font.PLAIN, 17));
			        
			        JTextArea QTextName = new JTextArea();
			        QTextName.setBounds(84, 59, 144, 20);
			        QTextName.setFont(new Font("Calibri", Font.PLAIN, 16));
			        QTextName.setBorder(border);
			        
			        JLabel QSurName = new JLabel("Surname:");
			        QSurName.setBounds(251, 63, 70, 17);
			        QSurName.setFont(new Font("Calibri", Font.PLAIN, 17));
			        QSurName.setForeground(Color.BLACK);
			        
			        JTextArea QTextSurName = new JTextArea();
			        QTextSurName.setBounds(325, 59, 144, 20);
			        QTextSurName.setFont(new Font("Calibri", Font.PLAIN, 17));
			        QTextSurName.setBorder(border);
			        
			        JLabel desk = new JLabel("Desk:");
			        desk.setBounds(492, 63, 40, 17);
			        desk.setFont(new Font("Calibri", Font.PLAIN, 17));
			        
			        JTextArea QTextdesk = new JTextArea();
			        QTextdesk.setBounds(536, 59, 32, 20);
			        QTextdesk.setFont(new Font("Calibri", Font.PLAIN, 17));
			        QTextdesk.setEditable(false);
			        QTextdesk.setBorder(border);
			        
			        JLabel QNumber = new JLabel("Number:");
			        QNumber.setBounds(591, 63, 62, 17);
			        QNumber.setFont(new Font("Calibri", Font.PLAIN, 17));
			        
			        JTextArea QTextNumber = new JTextArea();
			        QTextNumber.setBounds(659, 59, 49, 20);
			        QTextNumber.setFont(new Font("Calibri", Font.PLAIN, 19));
			        QTextNumber.setEditable(false);
			        QTextNumber.setBorder(border);
			        
			        JButton QBAdd = new RoundedButton("Add",new Color(42,115,141), 15);
			        QBAdd.setBounds(721, 53, 65, 32);
			        QBAdd.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
			        QBAdd.setForeground(Color.WHITE);
			        
			        JButton QBReset = new RoundedButton("Reset",new Color(42,115,141), 15);
			        QBReset.setBounds(283, 89, 86, 32);
			        QBReset.setVerticalAlignment(SwingConstants.BOTTOM);
			        QBReset.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
			        QBReset.setForeground(Color.WHITE);
			        
			        JButton QBDelete = new RoundedButton("Delete",new Color(42,115,141), 15);
			        QBDelete.setBounds(400, 89, 89, 32);
			        QBDelete.setVerticalAlignment(SwingConstants.BOTTOM);
			        QBDelete.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
			        QBDelete.setForeground(Color.WHITE);
			        
			        Queque s = new Queque("Nazim","Merdekanli",5,"K76");
			        
			        
			        
			        
			        QBAdd.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							final int ID[] = {0};
							
							if(!QTextName.getText().isEmpty() && !QTextSurName.getText().isEmpty()) {
					        	
					        	ID[0]++;
								Random QRNumber = new Random();
								Random Rdesk = new Random();
						       
								int random = QRNumber.nextInt(90)+10;
						        int RD = Rdesk.nextInt(10)+1;
						        String r = ("K" + random);
								
						        Qmodel1.addRow(new Object[] {ID[0],QTextName.getText(),QTextSurName.getText(),RD,r});
						        QTextName.setText(QTextName.getText());
						        QTextSurName.setText(QTextSurName.getText());
						        QTextdesk.setText(Integer.toString(RD));
						        QTextNumber.setText(r);
						        
						        for(int i=0; i<Qmodel1.getRowCount();i++) {
					            	Qmodel1.setValueAt(i+1, i ,0);
					            }
							    ID[0]= Qmodel1.getRowCount();
					        }else {
							
					        	JOptionPane.showMessageDialog(null, "Please enter your Name and Surname", null ,JOptionPane.WARNING_MESSAGE);
					        }
						}
			        	
			        });
			        
			        QBReset.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							QTextName.setText("");
					        QTextSurName.setText("");
					        QTextdesk.setText("");
					        QTextNumber.setText("");
						}
			        	
			        });
			        
			        
			        QBDelete.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							int QselectedRow = TQueue.getSelectedRow();
							
							final int ID[] = {0};
						    
							if (QselectedRow != -1) { 
					            DefaultTableModel model = (DefaultTableModel) TQueue.getModel();
					            model.removeRow(QselectedRow);
					            
					            for(int i=0; i<Qmodel1.getRowCount();i++) {
					            	Qmodel1.setValueAt(i+1, i ,0);
					            }
							    ID[0]= Qmodel1.getRowCount();
						} else {
		                    JOptionPane.showMessageDialog(null, "Please select a row to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
		                }
		            }
		        });
			        
			        MenuQueue.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FQueue.dispose();
							
						}
			        	
			        });
			        
			        
			        
			    FQueue.setLayout(null);
			    FQueue.add(Qs1);
			    FQueue.add(MenuQueue);
			    FQueue.add(Qpattern1);
				FQueue.add(Qpattern2);
				FQueue.add(Qpattern3);
				FQueue.add(Qpattern4);
				FQueue.add(QName);
				FQueue.add(QSurName);
				FQueue.add(desk);
				FQueue.add(QNumber);
				FQueue.add(QTextSurName);
				FQueue.add(QTextName);
				FQueue.add(QTextdesk);
				FQueue.add(QTextNumber);
				FQueue.add(LQueue);
				FQueue.add(QBAdd);
				FQueue.add(QBReset);
				FQueue.add(QBDelete);
				
			}
	    	
	    });  
	    
	    
	   //Workers 
	  //Chief Physicians
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    ChiefPhysicians CElsafa = new ChiefPhysicians("Elsafa","Həşimov","Kişi","Baş Uroloq","12.18.2019",8, 80, 2300);
	    ChiefPhysicians CNadir = new ChiefPhysicians("Nadir","Heydərov","Kişi","Baş Cərrah","06.23.2015",12, 130, 3200);
	    ChiefPhysicians CFiruze = new ChiefPhysicians("Firuzə","Məmmədova","Qadın","Baş Genekoloq","09.14.2022",7, 60, 1800);
	    ChiefPhysicians CAsif = new ChiefPhysicians("Asif","Səfərov","Kişi","Baş Travmatoloq","02.10.2021",9, 120, 2500);
	    ChiefPhysicians CGulnar = new ChiefPhysicians("Gülnar","Məmmədli","Qadın","Baş Terapevt","04.18.2017",14, 140, 2800);
	    
	    String ElsafaP = "$" + Double.toString(CElsafa.getPriceOfAppointment());
	    String ElsafaS = "$" + Double.toString(CElsafa.getSalary());
	    String ElsafaE = Integer.toString(CElsafa.getExperience())+" years";
	    
	    String NadirP = "$" + Double.toString(CNadir.getPriceOfAppointment());
	    String NadirS = "$" + Double.toString(CNadir.getSalary());
	    String NadirE = Integer.toString(CNadir.getExperience())+" years";
	    
	    String FiruzeP = "$" + Double.toString(CFiruze.getPriceOfAppointment());
	    String FiruzeS = "$" + Double.toString(CFiruze.getSalary());
	    String FiruzeE = Integer.toString(CFiruze.getExperience())+" years";
	    
	    String AsifP = "$" + Double.toString(CAsif.getPriceOfAppointment());
	    String AsifS = "$" + Double.toString(CAsif.getSalary());
	    String AsifE = Integer.toString(CAsif.getExperience())+" years";
	    
	    String GulnarP = "$" + Double.toString(CGulnar.getPriceOfAppointment());
	    String GulnarS = "$" + Double.toString(CGulnar.getSalary());
	    String GulnarE = Integer.toString(CGulnar.getExperience())+" years";
	    
	    DefaultTableModel Wmodel1 = new DefaultTableModel();
		Wmodel1.addColumn("ID");
		Wmodel1.addColumn("Name");
		Wmodel1.addColumn("Surname");
		Wmodel1.addColumn("Gender");
		Wmodel1.addColumn("Specialization");
		Wmodel1.addColumn("Experience");
		Wmodel1.addColumn("Date of Deployment");
		Wmodel1.addColumn("Price of Appointment");
		Wmodel1.addColumn("Salary");
	    
		JTable TChief = new JTable(Wmodel1);
		TChief.setBounds(9, 55, 796, 387);
		
	    BChiefP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FChief = new JFrame();
				FChief.setBounds(0, 0, 830, 572);
				FChief.getContentPane().setBackground(new Color(242,242,242));
				FChief.setLocationRelativeTo(FChief);
				FChief.setVisible(true);
				FChief.setResizable(false);
				
				DefaultTableModel Wmodel1 = new DefaultTableModel();
				Wmodel1.addColumn("ID");
				Wmodel1.addColumn("Name");
				Wmodel1.addColumn("Surname");
				Wmodel1.addColumn("Gender");
				Wmodel1.addColumn("Specialization");
				Wmodel1.addColumn("Experience");
				Wmodel1.addColumn("Date of Deployment");
				Wmodel1.addColumn("Price of Appointment");
				Wmodel1.addColumn("Salary");
				
				
				TChief.getColumnModel().getColumn(0).setPreferredWidth(25);
				TChief.getColumnModel().getColumn(1).setPreferredWidth(80);
				TChief.getColumnModel().getColumn(2).setPreferredWidth(80);
				TChief.getColumnModel().getColumn(3).setPreferredWidth(80);
				TChief.getColumnModel().getColumn(4).setPreferredWidth(107);
				TChief.getColumnModel().getColumn(5).setPreferredWidth(107);
				TChief.getColumnModel().getColumn(6).setPreferredWidth(125);
				TChief.getColumnModel().getColumn(7).setPreferredWidth(130);
				
				
				TChief.getTableHeader().setResizingAllowed(false);
				TChief.setDefaultEditor(Object.class, null);
				
				
				TChief.getTableHeader().setBackground(new Color(189,215,238));
				TChief.getTableHeader().setForeground(Color.BLACK);
				TChief.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane Ws1 = new JScrollPane(TChief);
			        Ws1.setBounds(9, 55, 796, 385);
			        Ws1.setBorder(border);
			        Ws1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuChief = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuChief.setBounds(360, 463, 93, 46);
			        MenuChief.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuChief.setForeground(Color.WHITE);
			        
			        JLabel LChief = new JLabel("Chief Physicians");
			        LChief.setBounds(320, 10, 190, 30);
			        LChief.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LChief.setForeground(Color.BLACK);
			        
			        JLabel Chiefpattern1 = new JLabel();
			        Chiefpattern1.setBounds(103, 446, 350,80);
			        Chiefpattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel Chiefpattern2 = new JLabel();
			        Chiefpattern2.setBounds(460, 446, 350,80);
			        Chiefpattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel Chiefpattern3 = new JLabel();
			        Chiefpattern3.setBounds(165, 5, 152,47);
			        Chiefpattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel Chiefpattern4 = new JLabel();
			        Chiefpattern4.setBounds(495, 5, 152,47);
			        Chiefpattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuChief.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FChief.dispose();
							
						}
			        	
			        });
			        
			       
							for (int i = 0; i < TChief.getRowCount(); i++) {
					            TChief.setValueAt(i + 1, i, 0); 
					        }

					        
			        FChief.setLayout(null);
			        FChief.add(Ws1);
			        FChief.add(MenuChief);
			        FChief.add(Chiefpattern1);
			        FChief.add(Chiefpattern2);
			        FChief.add(Chiefpattern3);
			        FChief.add(Chiefpattern4);
			        FChief.add(LChief);
			
			}
	    	
	    }); 
	    
	    int ID11 = 1;
		
		
		Wmodel1.addRow(new Object[] {ID11,CElsafa.getName(),CElsafa.getSurname(),CElsafa.getGender(),
				CElsafa.getSpecialization(),ElsafaE,CElsafa.getDateOfDeployment(),
				ElsafaP,ElsafaS});
		
		Wmodel1.addRow(new Object[] {ID11,CNadir.getName(),CNadir.getSurname(),CNadir.getGender(),
				CNadir.getSpecialization(),NadirE,CNadir.getDateOfDeployment(),
				NadirP,NadirS});
		
		Wmodel1.addRow(new Object[] {ID11,CFiruze.getName(),CFiruze.getSurname(),CFiruze.getGender(),
				CFiruze.getSpecialization(),FiruzeE,CFiruze.getDateOfDeployment(),
				FiruzeP,FiruzeS});
		
		Wmodel1.addRow(new Object[] {ID11,CAsif.getName(),CAsif.getSurname(),CAsif.getGender(),
				CAsif.getSpecialization(),AsifE,CAsif.getDateOfDeployment(),
				AsifP,AsifS});
		
		Wmodel1.addRow(new Object[] {ID11,CGulnar.getName(),CGulnar.getSurname(),CGulnar.getGender(),
				CGulnar.getSpecialization(),GulnarE,CGulnar.getDateOfDeployment(),
				GulnarP,GulnarS});
	    
     //Doctors
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	    
	   
	    Doctors DAkif = new Doctors("Akif","Aslanov","Kişi","Stomatoloq","12.17.2015",8, 60, 1400);
	    Doctors DNofer = new Doctors("Nofər","Bəşirov","Kişi","Dermatoloq","10.13.2023",12, 110, 2500);
	    Doctors CTehmine = new Doctors("Təhminə","Nəzərova","Qadın","Genekoloq","07.14.2020",7, 95, 1800);
	    Doctors CAdil = new Doctors("Adil","Vahidov","Kişi","Psixoloq","01.11.2021",9, 120, 1900);
	    Doctors CZemfira = new Doctors("Zemfira","Haciyeva","Qadın","Pulmonoloq","05.18.2019",6, 140, 2100);
	    
	    String AkifP = "$" + Double.toString(DAkif.getPriceOfAppointment());
	    String AkifS = "$" + Double.toString(DAkif.getSalary());
	    String AkifE = Integer.toString(DAkif.getExperience())+" years";
	    
	    String NoferP = "$" + Double.toString(DNofer.getPriceOfAppointment());
	    String NoferS = "$" + Double.toString(DNofer.getSalary());
	    String NoferE = Integer.toString(DNofer.getExperience())+" years";
	    
	    String TehmineP = "$" + Double.toString(CTehmine.getPriceOfAppointment());
	    String TehmineS = "$" + Double.toString(CTehmine.getSalary());
	    String TehmineE = Integer.toString(CTehmine.getExperience())+" years";
	    
	    String AdilP = "$" + Double.toString(CAdil.getPriceOfAppointment());
	    String AdilS = "$" + Double.toString(CAdil.getSalary());
	    String AdilE = Integer.toString(CAdil.getExperience())+" years";
	    
	    String ZemfiraP = "$" + Double.toString(CZemfira.getPriceOfAppointment());
	    String ZemfiraS = "$" + Double.toString(CZemfira.getSalary());
	    String ZemfiraE = Integer.toString(CZemfira.getExperience())+" years";
	    
	    DefaultTableModel DocModel1 = new DefaultTableModel();
		DocModel1.addColumn("ID");
		DocModel1.addColumn("Name");
		DocModel1.addColumn("Surname");
		DocModel1.addColumn("Gender");
		DocModel1.addColumn("Specialization");
		DocModel1.addColumn("Experience");
		DocModel1.addColumn("Date of Deployment");
		DocModel1.addColumn("Price of Appointment");
		DocModel1.addColumn("Salary");
		
		JTable TDoctors = new JTable(DocModel1);
		TDoctors.setBounds(9, 55, 796, 387);
	    
	    BDoctors.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FDoctors = new JFrame();
				FDoctors.setBounds(0, 0, 830, 572);
				FDoctors.getContentPane().setBackground(new Color(242,242,242));
				FDoctors.setLocationRelativeTo(FDoctors);
				FDoctors.setVisible(true);
				FDoctors.setResizable(false);
				
				
				TDoctors.getColumnModel().getColumn(0).setPreferredWidth(25);
				TDoctors.getColumnModel().getColumn(1).setPreferredWidth(80);
				TDoctors.getColumnModel().getColumn(2).setPreferredWidth(80);
				TDoctors.getColumnModel().getColumn(3).setPreferredWidth(80);
				TDoctors.getColumnModel().getColumn(4).setPreferredWidth(107);
				TDoctors.getColumnModel().getColumn(5).setPreferredWidth(107);
				TDoctors.getColumnModel().getColumn(6).setPreferredWidth(125);
				TDoctors.getColumnModel().getColumn(7).setPreferredWidth(130);
				
				
				TDoctors.getTableHeader().setResizingAllowed(false);
				TDoctors.setDefaultEditor(Object.class, null);
				
				
				TDoctors.getTableHeader().setBackground(new Color(189,215,238));
				TDoctors.getTableHeader().setForeground(Color.BLACK);
				TDoctors.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane Docs1 = new JScrollPane(TDoctors);
			        Docs1.setBounds(9, 55, 796, 385);
			        Docs1.setBorder(border);
			        Docs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuDoctors = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuDoctors.setBounds(360, 463, 93, 46);
			        MenuDoctors.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuDoctors.setForeground(Color.WHITE);
			        
			        JLabel LDoctors = new JLabel("Doctors");
			        LDoctors.setBounds(363, 10, 84, 30);
			        LDoctors.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LDoctors.setForeground(Color.BLACK);
			        
			        JLabel Doctorspattern1 = new JLabel();
			        Doctorspattern1.setBounds(103, 446, 350,80);
			        Doctorspattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel Doctorspattern2 = new JLabel();
			        Doctorspattern2.setBounds(460, 446, 350,80);
			        Doctorspattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel Doctorspattern3 = new JLabel();
			        Doctorspattern3.setBounds(206, 5, 152,47);
			        Doctorspattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel Doctorspattern4 = new JLabel();
			        Doctorspattern4.setBounds(451, 5, 152,47);
			        Doctorspattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuDoctors.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FDoctors.dispose();
							
						}
			        	
			        });
			        
			        
					for (int i = 0; i < TDoctors.getRowCount(); i++) {
						TDoctors.setValueAt(i + 1, i, 0); 
			        }
			        
			        FDoctors.setLayout(null);
			        FDoctors.add(Docs1);
			        FDoctors.add(MenuDoctors);
			        FDoctors.add(Doctorspattern1);
			        FDoctors.add(Doctorspattern2);
			        FDoctors.add(Doctorspattern3);
			        FDoctors.add(Doctorspattern4);
			        FDoctors.add(LDoctors);
			
			}
	    	
	    });  
	    
	    int ID12 = 1;
		
		
        DocModel1.addRow(new Object[] {ID12,DAkif.getName(),DAkif.getSurname(),DAkif.getGender(),
        		DAkif.getSpecialization(),AkifE,DAkif.getDateOfDeployment(),
        		AkifP,AkifS});
		
        DocModel1.addRow(new Object[] {ID12,DNofer.getName(),DNofer.getSurname(),DNofer.getGender(),
        		DNofer.getSpecialization(),NoferE,DNofer.getDateOfDeployment(),
        		NoferP,NoferS});
		
        DocModel1.addRow(new Object[] {ID12,CTehmine.getName(),CTehmine.getSurname(),CTehmine.getGender(),
        		CTehmine.getSpecialization(),TehmineE,CTehmine.getDateOfDeployment(),
        		TehmineP,TehmineS});
		
        DocModel1.addRow(new Object[] {ID12,CAdil.getName(),CAdil.getSurname(),CAdil.getGender(),
        		CAdil.getSpecialization(),AdilE,CAdil.getDateOfDeployment(),
        		AdilP,AdilS});
		
        DocModel1.addRow(new Object[] {ID12,CZemfira.getName(),CZemfira.getSurname(),CZemfira.getGender(),
        		CZemfira.getSpecialization(),ZemfiraE,CZemfira.getDateOfDeployment(),
        		ZemfiraP,ZemfiraS});
	    
	   //Dentists
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	   
	    Doctors DCemil = new Doctors("Cəmil","Aslanov","Kişi","Stomatoloq","12.17.2015",8, 60, 1400);
	    Doctors DAzer = new Doctors("Azər","Bəşirov","Kişi","Baş Stomatoloq","10.13.2023",12, 110, 2500);
	    Doctors DAyten = new Doctors("Aytən","Nəzərova","Qadın","Stomatoloq","07.14.2020",7, 95, 1800);
	    Doctors DVusal = new Doctors("Vüsal","Vahidov","Kişi","Baş Stomatoloq","01.11.2021",9, 120, 1900);
	    Doctors DFeride = new Doctors("Fəridə","Haciyeva","Qadın","Stomatoloq","05.18.2019",6, 140, 2100);
	    
	    String CemilP = "$" + Double.toString(DCemil.getPriceOfAppointment());
	    String CemilS = "$" + Double.toString(DCemil.getSalary());
	    String CemilE = Integer.toString(DCemil.getExperience())+" years";
	    
	    String AzerP = "$" + Double.toString(DAzer.getPriceOfAppointment());
	    String AzerS = "$" + Double.toString(DAzer.getSalary());
	    String AzerE = Integer.toString(DAzer.getExperience())+" years";
	    
	    String AytenP = "$" + Double.toString(DAyten.getPriceOfAppointment());
	    String AytenS = "$" + Double.toString(DAyten.getSalary());
	    String AytenE = Integer.toString(DAyten.getExperience())+" years";
	    
	    String VusalP = "$" + Double.toString(DVusal.getPriceOfAppointment());
	    String VusalS = "$" + Double.toString(DVusal.getSalary());
	    String VusalE = Integer.toString(DVusal.getExperience())+" years";
	    
	    String FerideP = "$" + Double.toString(DFeride.getPriceOfAppointment());
	    String FerideS = "$" + Double.toString(DFeride.getSalary());
	    String FerideE = Integer.toString(DFeride.getExperience())+" years";
	    
	    DefaultTableModel DenModel1 = new DefaultTableModel();
		DenModel1.addColumn("ID");
		DenModel1.addColumn("Name");
		DenModel1.addColumn("Surname");
		DenModel1.addColumn("Gender");
		DenModel1.addColumn("Specialization");
		DenModel1.addColumn("Experience");
		DenModel1.addColumn("Date of Deployment");
		DenModel1.addColumn("Price of Appointment");
		DenModel1.addColumn("Salary");
		
		JTable TDentists = new JTable(DenModel1);
		TDentists.setBounds(9, 55, 796, 387);
	    
	    BDentists.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FDentists = new JFrame();
				FDentists.setBounds(0, 0, 830, 572);
				FDentists.getContentPane().setBackground(new Color(242,242,242));
				FDentists.setLocationRelativeTo(FDentists);
				FDentists.setVisible(true);
				FDentists.setResizable(false);
				
				
				TDentists.getColumnModel().getColumn(0).setPreferredWidth(25);
				TDentists.getColumnModel().getColumn(1).setPreferredWidth(80);
				TDentists.getColumnModel().getColumn(2).setPreferredWidth(80);
				TDentists.getColumnModel().getColumn(3).setPreferredWidth(80);
				TDentists.getColumnModel().getColumn(4).setPreferredWidth(107);
				TDentists.getColumnModel().getColumn(5).setPreferredWidth(107);
				TDentists.getColumnModel().getColumn(6).setPreferredWidth(125);
				TDentists.getColumnModel().getColumn(7).setPreferredWidth(130);
				
				
				TDentists.getTableHeader().setResizingAllowed(false);
				TDentists.setDefaultEditor(Object.class, null);
				
				
				TDentists.getTableHeader().setBackground(new Color(189,215,238));
				TDentists.getTableHeader().setForeground(Color.BLACK);
				TDentists.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane Dens1 = new JScrollPane(TDentists);
			        Dens1.setBounds(9, 55, 796, 385);
			        Dens1.setBorder(border);
			        Dens1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuDentists = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuDentists.setBounds(360, 463, 93, 46);
			        MenuDentists.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuDentists.setForeground(Color.WHITE);
			        
			        JLabel LDentists = new JLabel("Dentists");
			        LDentists.setBounds(362, 10, 95, 30);
			        LDentists.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LDentists.setForeground(Color.BLACK);
			        
			        JLabel DentistsPattern1 = new JLabel();
			        DentistsPattern1.setBounds(103, 446, 350,80);
			        DentistsPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel DentistsPattern2 = new JLabel();
			        DentistsPattern2.setBounds(460, 446, 350,80);
			        DentistsPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel DentistsPattern3 = new JLabel();
			        DentistsPattern3.setBounds(205, 5, 152,47);
			        DentistsPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel DentistsPattern4 = new JLabel();
			        DentistsPattern4.setBounds(454, 5, 152,47);
			        DentistsPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuDentists.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FDentists.dispose();
							
						}
			        	
			        });
			        
                    
					
					
					for (int i = 0; i < TDentists.getRowCount(); i++) {
						TDentists.setValueAt(i + 1, i, 0); 
			        }
			        
			        FDentists.setLayout(null);
			        FDentists.add(Dens1);
			        FDentists.add(MenuDentists);
			        FDentists.add(DentistsPattern1);
			        FDentists.add(DentistsPattern2);
			        FDentists.add(DentistsPattern3);
			        FDentists.add(DentistsPattern4);
			        FDentists.add(LDentists);
			
			}
	    	
	    });
	    
	    int ID13 = 1;
		
		
        DenModel1.addRow(new Object[] {ID13,DCemil.getName(),DCemil.getSurname(),DCemil.getGender(),
        		DCemil.getSpecialization(),CemilE,DCemil.getDateOfDeployment(),
        		CemilP,CemilS});
		
        DenModel1.addRow(new Object[] {ID13,DAzer.getName(),DAzer.getSurname(),DAzer.getGender(),
        		DAzer.getSpecialization(),AzerE,DAzer.getDateOfDeployment(),
        		AzerP,AzerS});
		
        DenModel1.addRow(new Object[] {ID13,DAyten.getName(),DAyten.getSurname(),DAyten.getGender(),
        		DAyten.getSpecialization(),AytenE,DAyten.getDateOfDeployment(),
        		AytenP,AytenS});
		
        DenModel1.addRow(new Object[] {ID13,DVusal.getName(),DVusal.getSurname(),DVusal.getGender(),
        		DVusal.getSpecialization(),VusalE,DVusal.getDateOfDeployment(),
        		VusalP,VusalS});
		
        DenModel1.addRow(new Object[] {ID13,DFeride.getName(),DFeride.getSurname(),DFeride.getGender(),
        		DFeride.getSpecialization(),FerideE,DFeride.getDateOfDeployment(),
        		FerideP,FerideS});
	    
	  //Nurses
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    Nurses NAytekin = new Nurses("Aytəkin","Aslanova","Qadın","12.17.2015",8, 700);
	    Nurses NKamale = new Nurses("Kamalə","Bəşirova","Qadın","10.13.2023",12, 900);
	    Nurses NNurane = new Nurses("Nuranə","Nəzərova","Qadın","07.14.2020",7,600);
	    Nurses NQenire = new Nurses("Qənirə","Vahidova","Qadın","01.11.2021",9, 800);
	    Nurses NNigar = new Nurses("Nigar","Haciyeva","Qadın","05.18.2019",6, 700);
	    
	   
	    String AytekinS = "$" + Double.toString(NAytekin.getSalary());
	    String AytekinE = Integer.toString(NAytekin.getExperience())+" years";
	    
	    String KamaleS = "$" + Double.toString(NKamale.getSalary());
	    String KamaleE = Integer.toString(NKamale.getExperience())+" years";
	    
	    String NuraneS = "$" + Double.toString(NNurane.getSalary());
	    String NuraneE = Integer.toString(NNurane.getExperience())+" years";
	    
	    String QenireS = "$" + Double.toString(NQenire.getSalary());
	    String QenireE = Integer.toString(NQenire.getExperience())+" years";
	    
	    String NigarS = "$" + Double.toString(NNigar.getSalary());
	    String NigarE = Integer.toString(NNigar.getExperience())+" years";
	    
	    DefaultTableModel NursModel1 = new DefaultTableModel();
		NursModel1.addColumn("ID");
		NursModel1.addColumn("Name");
		NursModel1.addColumn("Surname");
		NursModel1.addColumn("Gender");
		NursModel1.addColumn("Experience");
		NursModel1.addColumn("Date of Deployment");
		NursModel1.addColumn("Salary");
		
		JTable TNurses = new JTable(NursModel1);
		TNurses.setBounds(9, 55, 796, 387);
	    
	    BNurses.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FNurses = new JFrame();
				FNurses.setBounds(0, 0, 830, 572);
				FNurses.getContentPane().setBackground(new Color(242,242,242));
				FNurses.setLocationRelativeTo(FNurses);
				FNurses.setVisible(true);
				FNurses.setResizable(false);
				
				
				TNurses.getColumnModel().getColumn(0).setPreferredWidth(25);
				TNurses.getColumnModel().getColumn(1).setPreferredWidth(127);
				TNurses.getColumnModel().getColumn(2).setPreferredWidth(127);
				TNurses.getColumnModel().getColumn(3).setPreferredWidth(127);
				TNurses.getColumnModel().getColumn(4).setPreferredWidth(127);
				TNurses.getColumnModel().getColumn(5).setPreferredWidth(127);
				TNurses.getColumnModel().getColumn(6).setPreferredWidth(127);
				
				
				TNurses.getTableHeader().setResizingAllowed(false);
				TNurses.setDefaultEditor(Object.class, null);
				
				
				TNurses.getTableHeader().setBackground(new Color(189,215,238));
				TNurses.getTableHeader().setForeground(Color.BLACK);
				TNurses.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane Nurs1 = new JScrollPane(TNurses);
			        Nurs1.setBounds(9, 55, 796, 385);
			        Nurs1.setBorder(border);
			        Nurs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuNurses = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuNurses.setBounds(360, 463, 93, 46);
			        MenuNurses.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuNurses.setForeground(Color.WHITE);
			        
			        JLabel LNurses = new JLabel("Nurses");
			        LNurses.setBounds(368, 10, 95, 30);
			        LNurses.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LNurses.setForeground(Color.BLACK);
			        
			        JLabel NursesPattern1 = new JLabel();
			        NursesPattern1.setBounds(103, 446, 350,80);
			        NursesPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel NursesPattern2 = new JLabel();
			        NursesPattern2.setBounds(460, 446, 350,80);
			        NursesPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel NursesPattern3 = new JLabel();
			        NursesPattern3.setBounds(211, 5, 152,47);
			        NursesPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel NursesPattern4 = new JLabel();
			        NursesPattern4.setBounds(446, 5, 152,47);
			        NursesPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuNurses.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FNurses.dispose();
							
						}
			        	
			        });
			        
					for (int i = 0; i < TNurses.getRowCount(); i++) {
						TNurses.setValueAt(i + 1, i, 0); 
			        }
			        
			        FNurses.setLayout(null);
			        FNurses.add(Nurs1);
			        FNurses.add(MenuNurses);
			        FNurses.add(NursesPattern1);
			        FNurses.add(NursesPattern2);
			        FNurses.add(NursesPattern3);
			        FNurses.add(NursesPattern4);
			        FNurses.add(LNurses);
			
			}
	    	
	    }); 
	    
	    int ID14 = 1;
		
		
        NursModel1.addRow(new Object[] {ID14,NAytekin.getName(),NAytekin.getSurname(),NAytekin.getGender(),
        		AytekinE,NAytekin.getDateOfDeployment(),
        		AytekinS});
		
        NursModel1.addRow(new Object[] {ID14,NKamale.getName(),NKamale.getSurname(),NKamale.getGender(),
        		KamaleE,NKamale.getDateOfDeployment(),
        		KamaleS});
		
        NursModel1.addRow(new Object[] {ID14,NNurane.getName(),NNurane.getSurname(),NNurane.getGender(),
        		NuraneE,NNurane.getDateOfDeployment(),
        		NuraneS});
		
        NursModel1.addRow(new Object[] {ID14,NQenire.getName(),NQenire.getSurname(),NQenire.getGender(),
        		QenireE,NQenire.getDateOfDeployment(),
        		QenireS});
		
        NursModel1.addRow(new Object[] {ID14,NNigar.getName(),NNigar.getSurname(),NNigar.getGender(),
        		NigarE,NNigar.getDateOfDeployment(),
        		NigarS});
	    
	  //Security
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    Security SZahir = new Security("Zahir","Aslanov","Kişi","12.17.2015", 700);
	    Security SNifteli = new Security("Nİftəli","Bəşirov","Kişi","10.13.2023", 900);
	    Security SBabek = new Security("Babək","Nəzərov","Kişi","07.14.2020",600);
	    Security SGulpare = new Security("Gülparə","Vahidova","Qadın","01.11.2021", 800);
	    Security SLeyla = new Security("Leyla","Haciyeva","Qadın","05.18.2019", 700);
	    
	   
	    String ZahirS = "$" + Double.toString(SZahir.getSalary());
	    String NifteliS = "$" + Double.toString(SNifteli.getSalary());
	    String BabekS = "$" + Double.toString(SBabek.getSalary());
	    String GulpareS = "$" + Double.toString(SGulpare.getSalary());
	    String LeylaS = "$" + Double.toString(SLeyla.getSalary());
	    
	    DefaultTableModel SecModel1 = new DefaultTableModel();
		SecModel1.addColumn("ID");
		SecModel1.addColumn("Name");
		SecModel1.addColumn("Surname");
		SecModel1.addColumn("Gender");
		SecModel1.addColumn("Date of Deployment");
		SecModel1.addColumn("Salary");
		
		JTable TSecurity = new JTable(SecModel1);
		TSecurity.setBounds(9, 55, 796, 387);
	    
	    BSecurity.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FSecurity = new JFrame();
				FSecurity.setBounds(0, 0, 830, 572);
				FSecurity.getContentPane().setBackground(new Color(242,242,242));
				FSecurity.setLocationRelativeTo(FSecurity);
				FSecurity.setVisible(true);
				FSecurity.setResizable(false);
				
				
				TSecurity.getColumnModel().getColumn(0).setPreferredWidth(25);
				TSecurity.getColumnModel().getColumn(1).setPreferredWidth(153);
				TSecurity.getColumnModel().getColumn(2).setPreferredWidth(153);
				TSecurity.getColumnModel().getColumn(3).setPreferredWidth(153);
				TSecurity.getColumnModel().getColumn(4).setPreferredWidth(153);
				TSecurity.getColumnModel().getColumn(5).setPreferredWidth(153);
				
				
				TSecurity.getTableHeader().setResizingAllowed(false);
				TSecurity.setDefaultEditor(Object.class, null);
				
				
				TSecurity.getTableHeader().setBackground(new Color(189,215,238));
				TSecurity.getTableHeader().setForeground(Color.BLACK);
				TSecurity.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane Secs1 = new JScrollPane(TSecurity);
			        Secs1.setBounds(9, 55, 796, 385);
			        Secs1.setBorder(border);
			        Secs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuSecurity = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuSecurity.setBounds(360, 463, 93, 46);
			        MenuSecurity.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuSecurity.setForeground(Color.WHITE);
			        
			        JLabel LSecurity = new JLabel("Security");
			        LSecurity.setBounds(363, 10, 95, 30);
			        LSecurity.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LSecurity.setForeground(Color.BLACK);
			        
			        JLabel SecurityPattern1 = new JLabel();
			        SecurityPattern1.setBounds(103, 446, 350,80);
			        SecurityPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel SecurityPattern2 = new JLabel();
			        SecurityPattern2.setBounds(460, 446, 350,80);
			        SecurityPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel SecurityPattern3 = new JLabel();
			        SecurityPattern3.setBounds(206, 5, 152,47);
			        SecurityPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel SecurityPattern4 = new JLabel();
			        SecurityPattern4.setBounds(453, 5, 152,47);
			        SecurityPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuSecurity.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FSecurity.dispose();
							
						}
			        	
			        });
			        
                        
					for (int i = 0; i < TSecurity.getRowCount(); i++) {
						TSecurity.setValueAt(i + 1, i, 0);
			        
					}
						
			        FSecurity.setLayout(null);
			        FSecurity.add(Secs1);
			        FSecurity.add(MenuSecurity);
			        FSecurity.add(SecurityPattern1);
			        FSecurity.add(SecurityPattern2);
			        FSecurity.add(SecurityPattern3);
			        FSecurity.add(SecurityPattern4);
			        FSecurity.add(LSecurity);
			
			}
	    	
	    }); 
	    
	    int ID15 = 1;
		
        SecModel1.addRow(new Object[] {ID15,SZahir.getName(),SZahir.getSurname(),SZahir.getGender(),
        		SZahir.getDateOfDeployment(),ZahirS});
	
        SecModel1.addRow(new Object[] {ID15,SNifteli.getName(),SNifteli.getSurname(),SNifteli.getGender(),
        		SNifteli.getDateOfDeployment(),NifteliS});
	
        SecModel1.addRow(new Object[] {ID15,SBabek.getName(),SBabek.getSurname(),SBabek.getGender(),
        		SBabek.getDateOfDeployment(),BabekS});
	
        SecModel1.addRow(new Object[] {ID15,SGulpare.getName(),SGulpare.getSurname(),SGulpare.getGender(),
        		SGulpare.getDateOfDeployment(),GulpareS});
	
        SecModel1.addRow(new Object[] {ID15,SLeyla.getName(),SLeyla.getSurname(),SLeyla.getGender(),
        		SLeyla.getDateOfDeployment(),LeylaS});
	    
	  //Receptionists
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    Receptionists RMehriban = new Receptionists("Mehriban","Aslanova","Qadın","12.17.2020", 800);
	    Receptionists RSudabe = new Receptionists("Südabə","Bəşirova","Qadın","10.13.2021", 800);
	    
	    String MehribanS = "$" + Double.toString(RMehriban.getSalary());
	    String SudabeS = "$" + Double.toString(RSudabe.getSalary());
	   
	    DefaultTableModel RecModel1 = new DefaultTableModel();
		RecModel1.addColumn("ID");
		RecModel1.addColumn("Name");
		RecModel1.addColumn("Surname");
		RecModel1.addColumn("Gender");
		RecModel1.addColumn("Date of Deployment");
		RecModel1.addColumn("Salary");
		
		JTable TReceptionists = new JTable(RecModel1);
		TReceptionists.setBounds(9, 55, 796, 387);
	    
	    BReceptionists.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FReceptionists = new JFrame();
				FReceptionists.setBounds(0, 0, 830, 572);
				FReceptionists.getContentPane().setBackground(new Color(242,242,242));
				FReceptionists.setLocationRelativeTo(FReceptionists);
				FReceptionists.setVisible(true);
				FReceptionists.setResizable(false);
				
				
				TReceptionists.getColumnModel().getColumn(0).setPreferredWidth(25);
				TReceptionists.getColumnModel().getColumn(1).setPreferredWidth(153);
				TReceptionists.getColumnModel().getColumn(2).setPreferredWidth(153);
				TReceptionists.getColumnModel().getColumn(3).setPreferredWidth(153);
				TReceptionists.getColumnModel().getColumn(4).setPreferredWidth(153);
				TReceptionists.getColumnModel().getColumn(5).setPreferredWidth(153);
				
				
				TReceptionists.getTableHeader().setResizingAllowed(false);
				TReceptionists.setDefaultEditor(Object.class, null);
				
				
				TReceptionists.getTableHeader().setBackground(new Color(189,215,238));
				TReceptionists.getTableHeader().setForeground(Color.BLACK);
				TReceptionists.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane Recs1 = new JScrollPane(TReceptionists);
			        Recs1.setBounds(9, 55, 796, 385);
			        Recs1.setBorder(border);
			        Recs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuReceptionists = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuReceptionists.setBounds(360, 463, 93, 46);
			        MenuReceptionists.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuReceptionists.setForeground(Color.WHITE);
			        
			        JLabel LReceptionists = new JLabel("Receptionists");
			        LReceptionists.setBounds(334, 10, 150, 30);
			        LReceptionists.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LReceptionists.setForeground(Color.BLACK);
			        
			        JLabel RecepPattern1 = new JLabel();
			        RecepPattern1.setBounds(103, 446, 350,80);
			        RecepPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel RecepPattern2 = new JLabel();
			        RecepPattern2.setBounds(460, 446, 350,80);
			        RecepPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel RecepPattern3 = new JLabel();
			        RecepPattern3.setBounds(177, 5, 152,47);
			        RecepPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel RecepPattern4 = new JLabel();
			        RecepPattern4.setBounds(482, 5, 152,47);
			        RecepPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuReceptionists.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FReceptionists.dispose();
							
						}
			        	
			        });
			        
			        
				for (int i = 0; i < TReceptionists.getRowCount(); i++) {
					TReceptionists.setValueAt(i + 1, i, 0);
		        
				}
			        
			        FReceptionists.setLayout(null);
			        FReceptionists.add(Recs1);
			        FReceptionists.add(MenuReceptionists);
			        FReceptionists.add(RecepPattern1);
			        FReceptionists.add(RecepPattern2);
			        FReceptionists.add(RecepPattern3);
			        FReceptionists.add(RecepPattern4);
			        FReceptionists.add(LReceptionists);
			        
			}
	    	
	    });  
	    
	    int ID16 = 1;
		
        RecModel1.addRow(new Object[] {ID16,RMehriban.getName(),RMehriban.getSurname(),RMehriban.getGender(),
        		RMehriban.getDateOfDeployment(),MehribanS});
	
        RecModel1.addRow(new Object[] {ID16,RSudabe.getName(),RSudabe.getSurname(),RSudabe.getGender(),
        		RSudabe.getDateOfDeployment(),SudabeS});
	
	
	  //Housekeepers
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    HouseKeepers HMehriban = new HouseKeepers("Mehriban","Aslanova","Qadın","12.17.2020", 800);
	    HouseKeepers HSudabe = new HouseKeepers("Südabə","Bəşirova","Qadın","10.13.2021", 800);
	    HouseKeepers HNuray = new HouseKeepers("Nuray","Əsgərova","Qadın","10.19.2022", 800);

	    String MehribaS = "$" + Double.toString(HMehriban.getSalary());
	    String SudabS = "$" + Double.toString(HSudabe.getSalary());
	    String NurayS = "$" + Double.toString(HNuray.getSalary());
	    
	    DefaultTableModel HouseModel1 = new DefaultTableModel();
		HouseModel1.addColumn("ID");
		HouseModel1.addColumn("Name");
		HouseModel1.addColumn("Surname");
		HouseModel1.addColumn("Gender");
		HouseModel1.addColumn("Date of Deployment");
		HouseModel1.addColumn("Salary");
		
		JTable THouse = new JTable(HouseModel1);
		THouse.setBounds(9, 55, 796, 387);
	    
	    BHousekeepers.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FHousekeepers = new JFrame();
				FHousekeepers.setBounds(0, 0, 830, 572);
				FHousekeepers.getContentPane().setBackground(new Color(242,242,242));
				FHousekeepers.setLocationRelativeTo(FHousekeepers);
				FHousekeepers.setVisible(true);
				FHousekeepers.setResizable(false);
				
				
				THouse.getColumnModel().getColumn(0).setPreferredWidth(25);
				THouse.getColumnModel().getColumn(1).setPreferredWidth(153);
				THouse.getColumnModel().getColumn(2).setPreferredWidth(153);
				THouse.getColumnModel().getColumn(3).setPreferredWidth(153);
				THouse.getColumnModel().getColumn(4).setPreferredWidth(153);
				THouse.getColumnModel().getColumn(5).setPreferredWidth(153);
				
				
				THouse.getTableHeader().setResizingAllowed(false);
				THouse.setDefaultEditor(Object.class, null);
				
				
				THouse.getTableHeader().setBackground(new Color(189,215,238));
				THouse.getTableHeader().setForeground(Color.BLACK);
				THouse.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane Houses1 = new JScrollPane(THouse);
			        Houses1.setBounds(9, 55, 796, 385);
			        Houses1.setBorder(border);
			        Houses1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuHouse = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuHouse.setBounds(360, 463, 93, 46);
			        MenuHouse.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuHouse.setForeground(Color.WHITE);
			        
			        JLabel LHouse = new JLabel("Housekeepers");
			        LHouse.setBounds(329, 10, 180, 30);
			        LHouse.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LHouse.setForeground(Color.BLACK);
			        
			        JLabel HousePattern1 = new JLabel();
			        HousePattern1.setBounds(103, 446, 350,80);
			        HousePattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel HousePattern2 = new JLabel();
			        HousePattern2.setBounds(460, 446, 350,80);
			        HousePattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel HousePattern3 = new JLabel();
			        HousePattern3.setBounds(172, 5, 152,47);
			        HousePattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel HousePattern4 = new JLabel();
			        HousePattern4.setBounds(487, 5, 152,47);
			        HousePattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuHouse.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FHousekeepers.dispose();
							
						}
			        	
			        });
			        
			        
				for (int i = 0; i < THouse.getRowCount(); i++) {
					THouse.setValueAt(i + 1, i, 0);
		        
				}
			        
			        FHousekeepers.setLayout(null);
			        FHousekeepers.add(Houses1);
			        FHousekeepers.add(MenuHouse);
			        FHousekeepers.add(HousePattern1);
			        FHousekeepers.add(HousePattern2);
			        FHousekeepers.add(HousePattern3);
			        FHousekeepers.add(HousePattern4);
			        FHousekeepers.add(LHouse);
			        
			}
	    	
	    }); 
	    
	    int ID17 = 1;
		
        HouseModel1.addRow(new Object[] {ID17,HMehriban.getName(),HMehriban.getSurname(),HMehriban.getGender(),
      		  HMehriban.getDateOfDeployment(),MehribaS});
	
        HouseModel1.addRow(new Object[] {ID17,HSudabe.getName(),HSudabe.getSurname(),HSudabe.getGender(),
      		  HSudabe.getDateOfDeployment(),SudabS});
        
        HouseModel1.addRow(new Object[] {ID17,HNuray.getName(),HNuray.getSurname(),HNuray.getGender(),
      		  HNuray.getDateOfDeployment(),NurayS});
	    
	    
	  //Rooms
	  //Patients Rooms
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	   
	    PatientsRooms PatientsRoom1 = new PatientsRooms("Bed Patients","Orta","Təmirlidir",242);
	    PatientsRooms PatientsRoom2 = new PatientsRooms("Bed Patients","Ağır","Təmirsizdir",195);
	    PatientsRooms PatientsRoom3 = new PatientsRooms("Bed Patients","Yüngül","Təmirlidir",321);
	    PatientsRooms PatientsRoom4 = new PatientsRooms("Bed Patients","Orta","Təmirsizdir",433);
	    
	    BPatientsR.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FPatientsR = new JFrame();
				FPatientsR.setBounds(0, 0, 830, 572);
				FPatientsR.getContentPane().setBackground(new Color(242,242,242));
				FPatientsR.setLocationRelativeTo(FPatientsR);
				FPatientsR.setVisible(true);
				FPatientsR.setResizable(false);
				
				DefaultTableModel PatientsRModel1 = new DefaultTableModel();
				PatientsRModel1.addColumn("ID");
				PatientsRModel1.addColumn("Type of Disease");
				PatientsRModel1.addColumn("Condition");
				PatientsRModel1.addColumn("Repairing");
				PatientsRModel1.addColumn("Number");
				
				JTable TPatientsR = new JTable(PatientsRModel1);
				TPatientsR.setBounds(9, 55, 796, 387);
				
				
				TPatientsR.getColumnModel().getColumn(0).setPreferredWidth(25);
				TPatientsR.getColumnModel().getColumn(1).setPreferredWidth(191);
				TPatientsR.getColumnModel().getColumn(2).setPreferredWidth(191);
				TPatientsR.getColumnModel().getColumn(3).setPreferredWidth(191);
				TPatientsR.getColumnModel().getColumn(4).setPreferredWidth(191);
				
				
				TPatientsR.getTableHeader().setResizingAllowed(false);
				TPatientsR.setDefaultEditor(Object.class, null);
				
				
				TPatientsR.getTableHeader().setBackground(new Color(189,215,238));
				TPatientsR.getTableHeader().setForeground(Color.BLACK);
				TPatientsR.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane PatientsRs1 = new JScrollPane(TPatientsR);
			        PatientsRs1.setBounds(9, 55, 796, 385);
			        PatientsRs1.setBorder(border);
			        PatientsRs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuPatientsR = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuPatientsR.setBounds(360, 463, 93, 46);
			        MenuPatientsR.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuPatientsR.setForeground(Color.WHITE);
			        
			        JLabel LPatientsR = new JLabel("Patients Rooms");
			        LPatientsR.setBounds(323, 10, 190, 30);
			        LPatientsR.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LPatientsR.setForeground(Color.BLACK);
			        
			        JLabel PatientsRPattern1 = new JLabel();
			        PatientsRPattern1.setBounds(103, 446, 350,80);
			        PatientsRPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel PatientsRPattern2 = new JLabel();
			        PatientsRPattern2.setBounds(460, 446, 350,80);
			        PatientsRPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel PatientsRPattern3 = new JLabel();
			        PatientsRPattern3.setBounds(166, 5, 152,47);
			        PatientsRPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel PatientsRPattern4 = new JLabel();
			        PatientsRPattern4.setBounds(496, 5, 152,47);
			        PatientsRPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuPatientsR.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FPatientsR.dispose();
							
						}
			        	
			        });
			        
                    int ID = 1;
					
                    PatientsRModel1.addRow(new Object[] {ID,PatientsRoom1.getTypeOfDisease(),PatientsRoom1.getCondition(),PatientsRoom1.getRepairing(),
                    		PatientsRoom1.getNumber()});
				
                    PatientsRModel1.addRow(new Object[] {ID,PatientsRoom2.getTypeOfDisease(),PatientsRoom2.getCondition(),PatientsRoom3.getRepairing(),
                    		PatientsRoom2.getNumber()});
                    
                    PatientsRModel1.addRow(new Object[] {ID,PatientsRoom3.getTypeOfDisease(),PatientsRoom3.getCondition(),PatientsRoom3.getRepairing(),
                    		PatientsRoom3.getNumber()});
                    
                    PatientsRModel1.addRow(new Object[] {ID,PatientsRoom4.getTypeOfDisease(),PatientsRoom4.getCondition(),PatientsRoom4.getRepairing(),
                    		PatientsRoom4.getNumber()});
				
				
				for (int i = 0; i < TPatientsR.getRowCount(); i++) {
					TPatientsR.setValueAt(i + 1, i, 0);
		        
				}
			        
			        FPatientsR.setLayout(null);
			        FPatientsR.add(PatientsRs1);
			        FPatientsR.add(MenuPatientsR);
			        FPatientsR.add(PatientsRPattern1);
			        FPatientsR.add(PatientsRPattern2);
			        FPatientsR.add(PatientsRPattern3);
			        FPatientsR.add(PatientsRPattern4);
			        FPatientsR.add(LPatientsR);
			        
			}
	    	
	    });
	    
	    
	  //Staff Rooms
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    StaffRooms HoouseSt = new StaffRooms("Housekeepers",245);
	    StaffRooms DoctorSt = new StaffRooms("Doctors",197);
	    StaffRooms SecuritySt = new StaffRooms("Security",325);
	    StaffRooms NursesSt = new StaffRooms("Nurses",439);
	    
	    BStaffR.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FStaffR = new JFrame();
				FStaffR.setBounds(0, 0, 830, 572);
				FStaffR.getContentPane().setBackground(new Color(242,242,242));
				FStaffR.setLocationRelativeTo(FStaffR);
				FStaffR.setVisible(true);
				FStaffR.setResizable(false);
				
				DefaultTableModel StaffRModel1 = new DefaultTableModel();
				StaffRModel1.addColumn("ID");
				StaffRModel1.addColumn("Staff Name");
				StaffRModel1.addColumn("Number");
				
				JTable TStaffR = new JTable(StaffRModel1);
				TStaffR.setBounds(9, 55, 796, 387);
				
				
				TStaffR.getColumnModel().getColumn(0).setPreferredWidth(25);
				TStaffR.getColumnModel().getColumn(1).setPreferredWidth(383);
				TStaffR.getColumnModel().getColumn(2).setPreferredWidth(382);
				
				
				TStaffR.getTableHeader().setResizingAllowed(false);
				TStaffR.setDefaultEditor(Object.class, null);
				
				
				TStaffR.getTableHeader().setBackground(new Color(189,215,238));
				TStaffR.getTableHeader().setForeground(Color.BLACK);
				TStaffR.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane StaffRs1 = new JScrollPane(TStaffR);
			        StaffRs1.setBounds(9, 55, 796, 385);
			        StaffRs1.setBorder(border);
			        StaffRs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuStaffR = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuStaffR.setBounds(360, 463, 93, 46);
			        MenuStaffR.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuStaffR.setForeground(Color.WHITE);
			        
			        JLabel LStaffR = new JLabel("Staff Rooms");
			        LStaffR.setBounds(340, 10, 170, 30);
			        LStaffR.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LStaffR.setForeground(Color.BLACK);
			        
			        JLabel StaffRPattern1 = new JLabel();
			        StaffRPattern1.setBounds(103, 446, 350,80);
			        StaffRPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel StaffRPattern2 = new JLabel();
			        StaffRPattern2.setBounds(460, 446, 350,80);
			        StaffRPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel StaffRPattern3 = new JLabel();
			        StaffRPattern3.setBounds(183, 5, 152,47);
			        StaffRPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel StaffRPattern4 = new JLabel();
			        StaffRPattern4.setBounds(476, 5, 152,47);
			        StaffRPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuStaffR.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FStaffR.dispose();
							
						}
			        	
			        });
			        
                    int ID = 1;
					
                    StaffRModel1.addRow(new Object[] {ID,HoouseSt.getStaffName(),HoouseSt.getNumber()});
				
                    StaffRModel1.addRow(new Object[] {ID,DoctorSt.getStaffName(),DoctorSt.getNumber()});
                    
                    StaffRModel1.addRow(new Object[] {ID,SecuritySt.getStaffName(),SecuritySt.getNumber()});
                    
                    StaffRModel1.addRow(new Object[] {ID,NursesSt.getStaffName(),NursesSt.getNumber()});
				
				
				for (int i = 0; i < TStaffR.getRowCount(); i++) {
					TStaffR.setValueAt(i + 1, i, 0);
		        
				}
			        
			        FStaffR.setLayout(null);
			        FStaffR.add(StaffRs1);
			        FStaffR.add(MenuStaffR);
			        FStaffR.add(StaffRPattern1);
			        FStaffR.add(StaffRPattern2);
			        FStaffR.add(StaffRPattern3);
			        FStaffR.add(StaffRPattern4);
			        FStaffR.add(LStaffR);
			        
			}
	    	
	    });  
	    
	    
      //Surgery Rooms
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	   
	    SurgeryRooms SurgeryRoom1 = new SurgeryRooms("Alim","Cəfərov","Kişi",214,true);
	    SurgeryRooms SurgeryRoom2 = new SurgeryRooms("Əli","Ramazanlı","Kişi",209,false);
	    SurgeryRooms SurgeryRoom3 = new SurgeryRooms("Akif","Adilov","Kişi",211,true);
	    SurgeryRooms SurgeryRoom4 = new SurgeryRooms("Zemfira","Məmmədli","Qadın",205,true);
	    
	    BSurgeryR.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FSurgeryR = new JFrame();
				FSurgeryR.setBounds(0, 0, 830, 572);
				FSurgeryR.getContentPane().setBackground(new Color(242,242,242));
				FSurgeryR.setLocationRelativeTo(FSurgeryR);
				FSurgeryR.setVisible(true);
				FSurgeryR.setResizable(false);
				
				DefaultTableModel SurgeryRModel1 = new DefaultTableModel();
				SurgeryRModel1.addColumn("ID");
				SurgeryRModel1.addColumn("Surgeon Name");
				SurgeryRModel1.addColumn("Surgeon Surname");
				SurgeryRModel1.addColumn("Gender");
				SurgeryRModel1.addColumn("Number");
				SurgeryRModel1.addColumn("Equipment");
				
				JTable TSurgeryR = new JTable(SurgeryRModel1);
				TSurgeryR.setBounds(9, 55, 796, 387);
				
				
				TSurgeryR.getColumnModel().getColumn(0).setPreferredWidth(25);
				TSurgeryR.getColumnModel().getColumn(1).setPreferredWidth(153);
				TSurgeryR.getColumnModel().getColumn(2).setPreferredWidth(153);
				TSurgeryR.getColumnModel().getColumn(3).setPreferredWidth(153);
				TSurgeryR.getColumnModel().getColumn(4).setPreferredWidth(153);
				TSurgeryR.getColumnModel().getColumn(5).setPreferredWidth(153);
				
				
				TSurgeryR.getTableHeader().setResizingAllowed(false);
				TSurgeryR.setDefaultEditor(Object.class, null);
				
				
				TSurgeryR.getTableHeader().setBackground(new Color(189,215,238));
				TSurgeryR.getTableHeader().setForeground(Color.BLACK);
				TSurgeryR.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane SurgeryRs1 = new JScrollPane(TSurgeryR);
			        SurgeryRs1.setBounds(9, 55, 796, 385);
			        SurgeryRs1.setBorder(border);
			        SurgeryRs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuSurgeryR = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuSurgeryR.setBounds(360, 463, 93, 46);
			        MenuSurgeryR.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuSurgeryR.setForeground(Color.WHITE);
			        
			        JLabel LSurgeryR = new JLabel("Surgery Rooms");
			        LSurgeryR.setBounds(323, 10, 165, 30);
			        LSurgeryR.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LSurgeryR.setForeground(Color.BLACK);
			        
			        JLabel SurgeryRPattern1 = new JLabel();
			        SurgeryRPattern1.setBounds(103, 446, 350,80);
			        SurgeryRPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel SurgeryRPattern2 = new JLabel();
			        SurgeryRPattern2.setBounds(460, 446, 350,80);
			        SurgeryRPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel SurgeryRPattern3 = new JLabel();
			        SurgeryRPattern3.setBounds(166, 5, 152,47);
			        SurgeryRPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel SurgeryRPattern4 = new JLabel();
			        SurgeryRPattern4.setBounds(491, 5, 152,47);
			        SurgeryRPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuSurgeryR.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FSurgeryR.dispose();
							
						}
			        	
			        });
			        
                    int ID = 1;
					
                    SurgeryRModel1.addRow(new Object[] {ID,SurgeryRoom1.getSurgeonName(),SurgeryRoom1.getSurgeonSurname(),SurgeryRoom1.getGender(),SurgeryRoom1.getNumber(),
                    		SurgeryRoom1.getEquipment()});
				
                    SurgeryRModel1.addRow(new Object[] {ID,SurgeryRoom2.getSurgeonName(),SurgeryRoom2.getSurgeonSurname(),SurgeryRoom2.getGender(),SurgeryRoom2.getNumber(),
                    		SurgeryRoom2.getEquipment()});
                    
                    SurgeryRModel1.addRow(new Object[] {ID,SurgeryRoom3.getSurgeonName(),SurgeryRoom3.getSurgeonSurname(),SurgeryRoom3.getGender(),SurgeryRoom3.getNumber(),
                    		SurgeryRoom3.getEquipment()});
                    
                    SurgeryRModel1.addRow(new Object[] {ID,SurgeryRoom4.getSurgeonName(),SurgeryRoom4.getSurgeonSurname(),SurgeryRoom4.getGender(),SurgeryRoom4.getNumber(),
                    		SurgeryRoom4.getEquipment()});
				
				
				for (int i = 0; i < TSurgeryR.getRowCount(); i++) {
					TSurgeryR.setValueAt(i + 1, i, 0);
		        
				}
			        
			        FSurgeryR.setLayout(null);
			        FSurgeryR.add(SurgeryRs1);
			        FSurgeryR.add(MenuSurgeryR);
			        FSurgeryR.add(SurgeryRPattern1);
			        FSurgeryR.add(SurgeryRPattern2);
			        FSurgeryR.add(SurgeryRPattern3);
			        FSurgeryR.add(SurgeryRPattern4);
			        FSurgeryR.add(LSurgeryR);
			        
			}
	    	
	    }); 
	    
	    
	  //Diagnostic Rooms
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    DiagnosticRooms DiagnosticRoom1 = new DiagnosticRooms("Alim","Cəfərov","Kişi",543,true);
	    DiagnosticRooms DiagnosticRoom2 = new DiagnosticRooms("Əli","Ramazanlı","Kişi",532,false);
	    DiagnosticRooms DiagnosticRoom3 = new DiagnosticRooms("Akif","Adilov","Kişi",564,true);
	    DiagnosticRooms DiagnosticRoom4 = new DiagnosticRooms("Zemfira","Məmmədli","Qadın",571,true);
	    
	    BDiagnosticR.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FDiagR = new JFrame();
				FDiagR.setBounds(0, 0, 830, 572);
				FDiagR.getContentPane().setBackground(new Color(242,242,242));
				FDiagR.setLocationRelativeTo(FDiagR);
				FDiagR.setVisible(true);
				FDiagR.setResizable(false);
				
				DefaultTableModel DiagRModel1 = new DefaultTableModel();
				DiagRModel1.addColumn("ID");
				DiagRModel1.addColumn("Name");
				DiagRModel1.addColumn("Surname");
				DiagRModel1.addColumn("Gender");
				DiagRModel1.addColumn("Number");
				DiagRModel1.addColumn("Equipment");
				
				JTable TDiagR = new JTable(DiagRModel1);
				TDiagR.setBounds(9, 55, 796, 387);
				
				
				TDiagR.getColumnModel().getColumn(0).setPreferredWidth(25);
				TDiagR.getColumnModel().getColumn(1).setPreferredWidth(153);
				TDiagR.getColumnModel().getColumn(2).setPreferredWidth(153);
				TDiagR.getColumnModel().getColumn(3).setPreferredWidth(153);
				TDiagR.getColumnModel().getColumn(4).setPreferredWidth(153);
				TDiagR.getColumnModel().getColumn(5).setPreferredWidth(153);
				
				
				TDiagR.getTableHeader().setResizingAllowed(false);
				TDiagR.setDefaultEditor(Object.class, null);
				
				
				TDiagR.getTableHeader().setBackground(new Color(189,215,238));
				TDiagR.getTableHeader().setForeground(Color.BLACK);
				TDiagR.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane DiagRs1 = new JScrollPane(TDiagR);
			        DiagRs1.setBounds(9, 55, 796, 385);
			        DiagRs1.setBorder(border);
			        DiagRs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuDiagR = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuDiagR.setBounds(360, 463, 93, 46);
			        MenuDiagR.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuDiagR.setForeground(Color.WHITE);
			        
			        JLabel LDiagR = new JLabel("Diagnostic Rooms");
			        LDiagR.setBounds(306, 10, 200, 30);
			        LDiagR.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LDiagR.setForeground(Color.BLACK);
			        
			        JLabel DiagRPattern1 = new JLabel();
			        DiagRPattern1.setBounds(103, 446, 350,80);
			        DiagRPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel DiagRPattern2 = new JLabel();
			        DiagRPattern2.setBounds(460, 446, 350,80);
			        DiagRPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel DiagRPattern3 = new JLabel();
			        DiagRPattern3.setBounds(149, 5, 152,47);
			        DiagRPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel DiagRPattern4 = new JLabel();
			        DiagRPattern4.setBounds(504, 5, 152,47);
			        DiagRPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuDiagR.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FDiagR.dispose();
							
						}
			        	
			        });
			        
                    int ID = 1;
					
                    DiagRModel1.addRow(new Object[] {ID,DiagnosticRoom1.getSurgeonName(),DiagnosticRoom1.getSurgeonSurname(),DiagnosticRoom1.getGender(),DiagnosticRoom1.getNumber(),
                    		DiagnosticRoom1.getEquipment()});
				
                    DiagRModel1.addRow(new Object[] {ID,DiagnosticRoom2.getSurgeonName(),DiagnosticRoom2.getSurgeonSurname(),DiagnosticRoom2.getGender(),DiagnosticRoom2.getNumber(),
                    		DiagnosticRoom2.getEquipment()});
                    
                    DiagRModel1.addRow(new Object[] {ID,DiagnosticRoom3.getSurgeonName(),DiagnosticRoom3.getSurgeonSurname(),DiagnosticRoom3.getGender(),DiagnosticRoom3.getNumber(),
                    		SurgeryRoom3.getEquipment()});
                    
                    DiagRModel1.addRow(new Object[] {ID,DiagnosticRoom4.getSurgeonName(),DiagnosticRoom4.getSurgeonSurname(),DiagnosticRoom4.getGender(),DiagnosticRoom4.getNumber(),
                    		DiagnosticRoom4.getEquipment()});
				
				
				for (int i = 0; i < TDiagR.getRowCount(); i++) {
					TDiagR.setValueAt(i + 1, i, 0);
		        
				}
			        
			        FDiagR.setLayout(null);
			        FDiagR.add(DiagRs1);
			        FDiagR.add(MenuDiagR);
			        FDiagR.add(DiagRPattern1);
			        FDiagR.add(DiagRPattern2);
			        FDiagR.add(DiagRPattern3);
			        FDiagR.add(DiagRPattern4);
			        FDiagR.add(LDiagR);
			        
			}
	    	
	    });  
	    
	    
	    //X-Ray Rooms
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	   
	    XrayRooms XrayRoom1 = new XrayRooms("Alim","Cəfərov","Kişi",621);
	    XrayRooms XrayRoom2 = new XrayRooms("Əli","Ramazanlı","Kişi",674);
	    XrayRooms XrayRoom3 = new XrayRooms("Akif","Adilov","Kişi",632);
	    XrayRooms XrayRoom4 = new XrayRooms("Zemfira","Məmmədli","Qadın",605);
	    
	    BXrayR.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FXrayR = new JFrame();
				FXrayR.setBounds(0, 0, 830, 572);
				FXrayR.getContentPane().setBackground(new Color(242,242,242));
				FXrayR.setLocationRelativeTo(FXrayR);
				FXrayR.setVisible(true);
				FXrayR.setResizable(false);
				
				DefaultTableModel XrayRModel1 = new DefaultTableModel();
				XrayRModel1.addColumn("ID");
				XrayRModel1.addColumn("Name");
				XrayRModel1.addColumn("Surname");
				XrayRModel1.addColumn("Gender");
				XrayRModel1.addColumn("Number");
				
				JTable TXrayR = new JTable(XrayRModel1);
				TXrayR.setBounds(9, 55, 796, 387);
				
				
				TXrayR.getColumnModel().getColumn(0).setPreferredWidth(25);
				TXrayR.getColumnModel().getColumn(1).setPreferredWidth(192);
				TXrayR.getColumnModel().getColumn(2).setPreferredWidth(192);
				TXrayR.getColumnModel().getColumn(3).setPreferredWidth(191);
				TXrayR.getColumnModel().getColumn(4).setPreferredWidth(190);
				
				
				TXrayR.getTableHeader().setResizingAllowed(false);
				TXrayR.setDefaultEditor(Object.class, null);
				
				
				TXrayR.getTableHeader().setBackground(new Color(189,215,238));
				TXrayR.getTableHeader().setForeground(Color.BLACK);
				TXrayR.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane XrayRs1 = new JScrollPane(TXrayR);
			        XrayRs1.setBounds(9, 55, 796, 385);
			        XrayRs1.setBorder(border);
			        XrayRs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuXrayR = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuXrayR.setBounds(360, 463, 93, 46);
			        MenuXrayR.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuXrayR.setForeground(Color.WHITE);
			        
			        JLabel LXrayR = new JLabel("X-Ray Rooms");
			        LXrayR.setBounds(334, 10, 160, 30);
			        LXrayR.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LXrayR.setForeground(Color.BLACK);
			        
			        JLabel XrayRPattern1 = new JLabel();
			        XrayRPattern1.setBounds(103, 446, 350,80);
			        XrayRPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel XrayRPattern2 = new JLabel();
			        XrayRPattern2.setBounds(460, 446, 350,80);
			        XrayRPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel XrayRPattern3 = new JLabel();
			        XrayRPattern3.setBounds(177, 5, 152,47);
			        XrayRPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel XrayRPattern4 = new JLabel();
			        XrayRPattern4.setBounds(485, 5, 152,47);
			        XrayRPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuXrayR.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FXrayR.dispose();
							
						}
			        	
			        });
			        
                    int ID = 1;
					
                    XrayRModel1.addRow(new Object[] {ID,XrayRoom1.getName(),XrayRoom1.getSurname(),XrayRoom1.getGender(),XrayRoom1.getNumber()});
				
                    XrayRModel1.addRow(new Object[] {ID,XrayRoom2.getName(),XrayRoom2.getSurname(),XrayRoom2.getGender(),XrayRoom2.getNumber()});
                    
                    XrayRModel1.addRow(new Object[] {ID,XrayRoom3.getName(),XrayRoom3.getSurname(),XrayRoom3.getGender(),XrayRoom3.getNumber()});
                    
                    XrayRModel1.addRow(new Object[] {ID,XrayRoom4.getName(),XrayRoom4.getSurname(),XrayRoom4.getGender(),XrayRoom4.getNumber()});
				
				
				for (int i = 0; i < TXrayR.getRowCount(); i++) {
					TXrayR.setValueAt(i + 1, i, 0);
		        
				}
			        
			        FXrayR.setLayout(null);
			        FXrayR.add(XrayRs1);
			        FXrayR.add(MenuXrayR);
			        FXrayR.add(XrayRPattern1);
			        FXrayR.add(XrayRPattern2);
			        FXrayR.add(XrayRPattern3);
			        FXrayR.add(XrayRPattern4);
			        FXrayR.add(LXrayR);
			        
			}
	    	
	    });
	    
	    
	  //Patients  
	  //Bed Patients
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    BedPatients MehribanP = new BedPatients("Mehriban","Aslanova","Qadın","Bed Patient","12.17.2020","050-766-83-**","Meh@gmail.com");
	    BedPatients SudabeP = new BedPatients("Südabə","Bəşirova","Qadın","Bed Patient","12.17.2018","055-345-57-**","Sudabe7@mail.ru");
	    BedPatients NurayP = new BedPatients("Nuray","Əsgərova","Qadın","Bed Patient","12.17.2020","050-766-83-**","Nuray@gmail.com");

	    DefaultTableModel BedPModel1 = new DefaultTableModel();
		BedPModel1.addColumn("ID");
		BedPModel1.addColumn("Name");
		BedPModel1.addColumn("Surname");
		BedPModel1.addColumn("Gender");
		BedPModel1.addColumn("Type of Disease");
		BedPModel1.addColumn("Date of Registration");
		BedPModel1.addColumn("Number");
		BedPModel1.addColumn("E-mail");
	    
		JTable TBedP = new JTable(BedPModel1);
		TBedP.setBounds(9, 55, 796, 387);
		
	    BBedP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FBedP = new JFrame();
				FBedP.setBounds(0, 0, 830, 572);
				FBedP.getContentPane().setBackground(new Color(242,242,242));
				FBedP.setLocationRelativeTo(FBedP);
				FBedP.setVisible(true);
				FBedP.setResizable(false);
				
				
				TBedP.getColumnModel().getColumn(0).setPreferredWidth(25);
				TBedP.getColumnModel().getColumn(1).setPreferredWidth(97);
				TBedP.getColumnModel().getColumn(2).setPreferredWidth(97);
				TBedP.getColumnModel().getColumn(3).setPreferredWidth(97);
				TBedP.getColumnModel().getColumn(4).setPreferredWidth(109);
				TBedP.getColumnModel().getColumn(5).setPreferredWidth(125);
				TBedP.getColumnModel().getColumn(6).setPreferredWidth(95);
				TBedP.getColumnModel().getColumn(7).setPreferredWidth(147);
				
				
				TBedP.getTableHeader().setResizingAllowed(false);
				TBedP.setDefaultEditor(Object.class, null);
				
				
				TBedP.getTableHeader().setBackground(new Color(189,215,238));
				TBedP.getTableHeader().setForeground(Color.BLACK);
				TBedP.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane BedPs1 = new JScrollPane(TBedP);
			        BedPs1.setBounds(9, 55, 796, 385);
			        BedPs1.setBorder(border);
			        BedPs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuBedP = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuBedP.setBounds(360, 463, 93, 46);
			        MenuBedP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuBedP.setForeground(Color.WHITE);
			        
			        JLabel LBedP = new JLabel("Bed Patients");
			        LBedP.setBounds(337, 10, 160, 30);
			        LBedP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LBedP.setForeground(Color.BLACK);
			        
			        JLabel BedPPattern1 = new JLabel();
			        BedPPattern1.setBounds(103, 446, 350,80);
			        BedPPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel BedPPattern2 = new JLabel();
			        BedPPattern2.setBounds(460, 446, 350,80);
			        BedPPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel BedPPattern3 = new JLabel();
			        BedPPattern3.setBounds(180, 5, 152,47);
			        BedPPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel BedPPattern4 = new JLabel();
			        BedPPattern4.setBounds(478, 5, 152,47);
			        BedPPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuBedP.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FBedP.dispose();
							
						}
			        	
			        });
			        
				
				for (int i = 0; i < TBedP.getRowCount(); i++) {
					TBedP.setValueAt(i + 1, i, 0);
		        
				}
			        
			        FBedP.setLayout(null);
			        FBedP.add(BedPs1);
			        FBedP.add(MenuBedP);
			        FBedP.add(BedPPattern1);
			        FBedP.add(BedPPattern2);
			        FBedP.add(BedPPattern3);
			        FBedP.add(BedPPattern4);
			        FBedP.add(LBedP);
			        
			}
	    	
	    }); 
	    
	    int ID1 = 1;
		
        BedPModel1.addRow(new Object[] {ID1,MehribanP.getName(),MehribanP.getSurname(),MehribanP.getGender(),
        		MehribanP.getTypeOfDisease(),MehribanP.getDateOfRegistration(),MehribanP.getNumber(),MehribanP.getEmail()});
	
        BedPModel1.addRow(new Object[] {ID1,SudabeP.getName(),SudabeP.getSurname(),SudabeP.getGender(),
        		SudabeP.getTypeOfDisease(),SudabeP.getDateOfRegistration(),SudabeP.getNumber(),SudabeP.getEmail()});
        
        BedPModel1.addRow(new Object[] {ID1,NurayP.getName(),NurayP.getSurname(),NurayP.getGender(),
        		NurayP.getTypeOfDisease(),NurayP.getDateOfRegistration(),NurayP.getNumber(),NurayP.getEmail()});
	    
	  //Infectious Patients
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    InfectiousPatients MehribanI = new InfectiousPatients("Mehriban","Aslanova","Qadın","Infectious Patient","12.17.2020","050-766-83-**","Meh@gmail.com");
	    InfectiousPatients SudabeI = new InfectiousPatients("Südabə","Bəşirova","Qadın","Infectious Patient","12.17.2018","055-345-57-**","Sudabe7@mail.ru");
	    InfectiousPatients NurayI = new InfectiousPatients("Nuray","Əsgərova","Qadın","Infectious Patient","12.17.2020","050-766-83-**","Nuray@gmail.com");
	    
	    DefaultTableModel InfectPModel1 = new DefaultTableModel();
		InfectPModel1.addColumn("ID");
		InfectPModel1.addColumn("Name");
		InfectPModel1.addColumn("Surname");
		InfectPModel1.addColumn("Gender");
		InfectPModel1.addColumn("Type of Disease");
		InfectPModel1.addColumn("Date of Registration");
		InfectPModel1.addColumn("Number");
		InfectPModel1.addColumn("E-mail");
	    
		JTable TInfectP = new JTable(InfectPModel1);
		TInfectP.setBounds(9, 55, 796, 387);
		
	    BInfectiousP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FInfectP = new JFrame();
				FInfectP.setBounds(0, 0, 830, 572);
				FInfectP.getContentPane().setBackground(new Color(242,242,242));
				FInfectP.setLocationRelativeTo(FInfectP);
				FInfectP.setVisible(true);
				FInfectP.setResizable(false);
				
				
				TInfectP.getColumnModel().getColumn(0).setPreferredWidth(25);
				TInfectP.getColumnModel().getColumn(1).setPreferredWidth(97);
				TInfectP.getColumnModel().getColumn(2).setPreferredWidth(97);
				TInfectP.getColumnModel().getColumn(3).setPreferredWidth(97);
				TInfectP.getColumnModel().getColumn(4).setPreferredWidth(109);
				TInfectP.getColumnModel().getColumn(5).setPreferredWidth(125);
				TInfectP.getColumnModel().getColumn(6).setPreferredWidth(95);
				TInfectP.getColumnModel().getColumn(7).setPreferredWidth(147);
				
				
				TInfectP.getTableHeader().setResizingAllowed(false);
				TInfectP.setDefaultEditor(Object.class, null);
				
				
				TInfectP.getTableHeader().setBackground(new Color(189,215,238));
				TInfectP.getTableHeader().setForeground(Color.BLACK);
				TInfectP.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane InfectPs1 = new JScrollPane(TInfectP);
			        InfectPs1.setBounds(9, 55, 796, 385);
			        InfectPs1.setBorder(border);
			        InfectPs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuInfectP = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuInfectP.setBounds(360, 463, 93, 46);
			        MenuInfectP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuInfectP.setForeground(Color.WHITE);
			        
			        JLabel LInfectP = new JLabel("Infectious Patients");
			        LInfectP.setBounds(307, 10, 210, 30);
			        LInfectP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LInfectP.setForeground(Color.BLACK);
			        
			        JLabel InfectPPattern1 = new JLabel();
			        InfectPPattern1.setBounds(103, 446, 350,80);
			        InfectPPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel InfectPPattern2 = new JLabel();
			        InfectPPattern2.setBounds(460, 446, 350,80);
			        InfectPPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel InfectPPattern3 = new JLabel();
			        InfectPPattern3.setBounds(150, 5, 152,47);
			        InfectPPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel InfectPPattern4 = new JLabel();
			        InfectPPattern4.setBounds(513, 5, 152,47);
			        InfectPPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuInfectP.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FInfectP.dispose();
							
						}
			        	
			        });
			        
				
				for (int i = 0; i < TInfectP.getRowCount(); i++) {
					TInfectP.setValueAt(i + 1, i, 0);
		        
				}
			        
				    FInfectP.setLayout(null);
				    FInfectP.add(InfectPs1);
			        FInfectP.add(MenuInfectP);
			        FInfectP.add(InfectPPattern1);
			        FInfectP.add(InfectPPattern2);
			        FInfectP.add(InfectPPattern3);
			        FInfectP.add(InfectPPattern4);
			        FInfectP.add(LInfectP);
			        
			}
	    	
	    });
	    
	    int ID2 = 1;
		
        InfectPModel1.addRow(new Object[] {ID2,MehribanI.getName(),MehribanI.getSurname(),MehribanI.getGender(),
        		MehribanI.getTypeOfDisease(),MehribanI.getDateOfRegistration(),MehribanI.getNumber(),MehribanI.getEmail()});
	
        InfectPModel1.addRow(new Object[] {ID2,SudabeI.getName(),SudabeI.getSurname(),SudabeI.getGender(),
        		SudabeI.getTypeOfDisease(),SudabeI.getDateOfRegistration(),SudabeI.getNumber(),SudabeI.getEmail()});
        
        InfectPModel1.addRow(new Object[] {ID2,NurayI.getName(),NurayI.getSurname(),NurayI.getGender(),
        		NurayI.getTypeOfDisease(),NurayI.getDateOfRegistration(),NurayI.getNumber(),NurayI.getEmail()});
	    
	  //Chronic Patients
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	   
	    ChronicPatients MehribanC = new ChronicPatients("Mehriban","Aslanova","Qadın","Chronic Patient","12.17.2020","050-766-83-**","Meh@gmail.com");
	    ChronicPatients SudabeC = new ChronicPatients("Südabə","Bəşirova","Qadın","Chronic Patient","12.17.2018","055-345-57-**","Sudabe7@mail.ru");
	    ChronicPatients NurayC = new ChronicPatients("Nuray","Əsgərova","Qadın","Chronic Patient","12.17.2020","050-766-83-**","Nuray@gmail.com");
	    
	    DefaultTableModel ChronicPModel1 = new DefaultTableModel();
		ChronicPModel1.addColumn("ID");
		ChronicPModel1.addColumn("Name");
		ChronicPModel1.addColumn("Surname");
		ChronicPModel1.addColumn("Gender");
		ChronicPModel1.addColumn("Type of Disease");
		ChronicPModel1.addColumn("Date of Registration");
		ChronicPModel1.addColumn("Number");
		ChronicPModel1.addColumn("E-mail");
	    
		JTable TChronicP = new JTable(ChronicPModel1);
		TChronicP.setBounds(9, 55, 796, 387);
		
	    BChronicP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FChronicP = new JFrame();
				FChronicP.setBounds(0, 0, 830, 572);
				FChronicP.getContentPane().setBackground(new Color(242,242,242));
				FChronicP.setLocationRelativeTo(FChronicP);
				FChronicP.setVisible(true);
				FChronicP.setResizable(false);
				
				
				TChronicP.getColumnModel().getColumn(0).setPreferredWidth(25);
				TChronicP.getColumnModel().getColumn(1).setPreferredWidth(97);
				TChronicP.getColumnModel().getColumn(2).setPreferredWidth(97);
				TChronicP.getColumnModel().getColumn(3).setPreferredWidth(97);
				TChronicP.getColumnModel().getColumn(4).setPreferredWidth(109);
				TChronicP.getColumnModel().getColumn(5).setPreferredWidth(125);
				TChronicP.getColumnModel().getColumn(6).setPreferredWidth(95);
				TChronicP.getColumnModel().getColumn(7).setPreferredWidth(147);
				
				
				TChronicP.getTableHeader().setResizingAllowed(false);
				TChronicP.setDefaultEditor(Object.class, null);
				
				
				TChronicP.getTableHeader().setBackground(new Color(189,215,238));
				TChronicP.getTableHeader().setForeground(Color.BLACK);
				TChronicP.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane ChronicPs1 = new JScrollPane(TChronicP);
			        ChronicPs1.setBounds(9, 55, 796, 385);
			        ChronicPs1.setBorder(border);
			        ChronicPs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuChronicP = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuChronicP.setBounds(360, 463, 93, 46);
			        MenuChronicP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuChronicP.setForeground(Color.WHITE);
			        
			        JLabel LChronicP = new JLabel("Chronic Patients");
			        LChronicP.setBounds(318, 10, 190, 30);
			        LChronicP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LChronicP.setForeground(Color.BLACK);
			        
			        JLabel ChronicPPattern1 = new JLabel();
			        ChronicPPattern1.setBounds(103, 446, 350,80);
			        ChronicPPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel ChronicPPattern2 = new JLabel();
			        ChronicPPattern2.setBounds(460, 446, 350,80);
			        ChronicPPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel ChronicPPattern3 = new JLabel();
			        ChronicPPattern3.setBounds(161, 5, 152,47);
			        ChronicPPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel ChronicPPattern4 = new JLabel();
			        ChronicPPattern4.setBounds(500, 5, 152,47);
			        ChronicPPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuChronicP.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FChronicP.dispose();
							
						}
			        	
			        });
			        
                  
				for (int i = 0; i < TChronicP.getRowCount(); i++) {
					TChronicP.setValueAt(i + 1, i, 0);
		        
				}
			        
			        FChronicP.setLayout(null);
			        FChronicP.add(ChronicPs1);
			        FChronicP.add(MenuChronicP);
			        FChronicP.add(ChronicPPattern1);
			        FChronicP.add(ChronicPPattern2);
			        FChronicP.add(ChronicPPattern3);
			        FChronicP.add(ChronicPPattern4);
			        FChronicP.add(LChronicP);
			        
			}
	    	
	    });  
	    
	    int ID3 = 1;
		
        ChronicPModel1.addRow(new Object[] {ID3,MehribanC.getName(),MehribanC.getSurname(),MehribanC.getGender(),
        		MehribanC.getTypeOfDisease(),MehribanC.getDateOfRegistration(),MehribanC.getNumber(),MehribanC.getEmail()});
	
        ChronicPModel1.addRow(new Object[] {ID3,SudabeC.getName(),SudabeC.getSurname(),SudabeC.getGender(),
        		SudabeC.getTypeOfDisease(),SudabeC.getDateOfRegistration(),SudabeC.getNumber(),SudabeC.getEmail()});
        
        ChronicPModel1.addRow(new Object[] {ID3,NurayC.getName(),NurayC.getSurname(),NurayC.getGender(),
        		NurayC.getTypeOfDisease(),NurayC.getDateOfRegistration(),NurayC.getNumber(),NurayC.getEmail()});
	    
	  //Genetic Patients
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ 
	    
	    GeneticPatients MehribanG = new GeneticPatients("Mehriban","Aslanova","Qadın","Genetic Patient","12.17.2020","050-766-83-**","Meh@gmail.com");
	    GeneticPatients SudabeG = new GeneticPatients("Südabə","Bəşirova","Qadın","Genetic Patient","12.17.2018","055-345-57-**","Sudabe7@mail.ru");
	    GeneticPatients NurayG = new GeneticPatients("Nuray","Əsgərova","Qadın","Genetic Patient","12.17.2020","050-766-83-**","Nuray@gmail.com");
	    
	    DefaultTableModel GeneticPModel1 = new DefaultTableModel();
		GeneticPModel1.addColumn("ID");
		GeneticPModel1.addColumn("Name");
		GeneticPModel1.addColumn("Surname");
		GeneticPModel1.addColumn("Gender");
		GeneticPModel1.addColumn("Type of Disease");
		GeneticPModel1.addColumn("Date of Registration");
		GeneticPModel1.addColumn("Number");
		GeneticPModel1.addColumn("E-mail");
	    
		JTable TGeneticP = new JTable(GeneticPModel1);
		TGeneticP.setBounds(9, 55, 796, 387);
		
	    BGeneticP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FGeneticP = new JFrame();
				FGeneticP.setBounds(0, 0, 830, 572);
				FGeneticP.getContentPane().setBackground(new Color(242,242,242));
				FGeneticP.setLocationRelativeTo(FGeneticP);
				FGeneticP.setVisible(true);
				FGeneticP.setResizable(false);
				
				
				TGeneticP.getColumnModel().getColumn(0).setPreferredWidth(25);
				TGeneticP.getColumnModel().getColumn(1).setPreferredWidth(97);
				TGeneticP.getColumnModel().getColumn(2).setPreferredWidth(97);
				TGeneticP.getColumnModel().getColumn(3).setPreferredWidth(97);
				TGeneticP.getColumnModel().getColumn(4).setPreferredWidth(109);
				TGeneticP.getColumnModel().getColumn(5).setPreferredWidth(125);
				TGeneticP.getColumnModel().getColumn(6).setPreferredWidth(95);
				TGeneticP.getColumnModel().getColumn(7).setPreferredWidth(147);
				
				TGeneticP.getTableHeader().setBackground(new Color(189,215,238));
				TGeneticP.getTableHeader().setForeground(Color.BLACK);
				TGeneticP.getTableHeader().setReorderingAllowed(false);	
				
				TGeneticP.getTableHeader().setResizingAllowed(false);
				TGeneticP.setDefaultEditor(Object.class, null);
			       
			        JScrollPane GeneticPs1 = new JScrollPane(TGeneticP);
			        GeneticPs1.setBounds(9, 55, 796, 385);
			        GeneticPs1.setBorder(border);
			        GeneticPs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuGeneticP = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuGeneticP.setBounds(360, 463, 93, 46);
			        MenuGeneticP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuGeneticP.setForeground(Color.WHITE);
			        
			        JLabel LGeneticP = new JLabel("Genetic Patients");
			        LGeneticP.setBounds(318, 10, 180, 30);
			        LGeneticP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LGeneticP.setForeground(Color.BLACK);
			        
			        JLabel GeneticPPattern1 = new JLabel();
			        GeneticPPattern1.setBounds(103, 446, 350,80);
			        GeneticPPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel GeneticPPattern2 = new JLabel();
			        GeneticPPattern2.setBounds(460, 446, 350,80);
			        GeneticPPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel GeneticPPattern3 = new JLabel();
			        GeneticPPattern3.setBounds(161, 5, 152,47);
			        GeneticPPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel GeneticPPattern4 = new JLabel();
			        GeneticPPattern4.setBounds(500, 5, 152,47);
			        GeneticPPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuGeneticP.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FGeneticP.dispose();
							
						}
			        	
			        });
			        
                    
				for (int i = 0; i < TGeneticP.getRowCount(); i++) {
					TGeneticP.setValueAt(i + 1, i, 0);
		        
				}
			        
			        FGeneticP.setLayout(null);
			        FGeneticP.add(GeneticPs1);
			        FGeneticP.add(MenuGeneticP);
			        FGeneticP.add(GeneticPPattern1);
			        FGeneticP.add(GeneticPPattern2);
			        FGeneticP.add(GeneticPPattern3);
			        FGeneticP.add(GeneticPPattern4);
			        FGeneticP.add(LGeneticP);
			        
			}
	    	
	    });  
	    
	    int ID4 = 1;
		
        GeneticPModel1.addRow(new Object[] {ID4,MehribanG.getName(),MehribanG.getSurname(),MehribanG.getGender(),
        		MehribanG.getTypeOfDisease(),MehribanG.getDateOfRegistration(),MehribanG.getNumber(),MehribanG.getEmail()});
	
        GeneticPModel1.addRow(new Object[] {ID4,SudabeG.getName(),SudabeG.getSurname(),SudabeG.getGender(),
        		SudabeG.getTypeOfDisease(),SudabeG.getDateOfRegistration(),SudabeG.getNumber(),SudabeG.getEmail()});
        
        GeneticPModel1.addRow(new Object[] {ID4,NurayG.getName(),NurayG.getSurname(),NurayG.getGender(),
        		NurayG.getTypeOfDisease(),NurayG.getDateOfRegistration(),NurayG.getNumber(),NurayG.getEmail()});
	    
	  //Cancer Patients
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    CancerPatients MehribanCa = new CancerPatients("Mehriban","Aslanova","Qadın","Cancer Patient","12.17.2020","050-766-83-**","Meh@gmail.com");
	    CancerPatients SudabeCa = new CancerPatients("Südabə","Bəşirova","Qadın","Cancer Patient","12.17.2018","055-345-57-**","Sudabe7@mail.ru");
	    CancerPatients NurayCa = new CancerPatients("Nuray","Əsgərova","Qadın","Cancer Patient","12.17.2020","050-766-83-**","Nuray@gmail.com");
	    
	    DefaultTableModel CancerPModel1 = new DefaultTableModel();
		CancerPModel1.addColumn("ID");
		CancerPModel1.addColumn("Name");
		CancerPModel1.addColumn("Surname");
		CancerPModel1.addColumn("Gender");
		CancerPModel1.addColumn("Type of Disease");
		CancerPModel1.addColumn("Date of Registration");
		CancerPModel1.addColumn("Number");
		CancerPModel1.addColumn("E-mail");
	    
		JTable TCancerP = new JTable(CancerPModel1);
		TCancerP.setBounds(9, 55, 796, 387);
		
	    BCancerP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FCancerP = new JFrame();
				FCancerP.setBounds(0, 0, 830, 572);
				FCancerP.getContentPane().setBackground(new Color(242,242,242));
				FCancerP.setLocationRelativeTo(FCancerP);
				FCancerP.setVisible(true);
				FCancerP.setResizable(false);
			
				
				TCancerP.getColumnModel().getColumn(0).setPreferredWidth(25);
				TCancerP.getColumnModel().getColumn(1).setPreferredWidth(97);
				TCancerP.getColumnModel().getColumn(2).setPreferredWidth(97);
				TCancerP.getColumnModel().getColumn(3).setPreferredWidth(97);
				TCancerP.getColumnModel().getColumn(4).setPreferredWidth(109);
				TCancerP.getColumnModel().getColumn(5).setPreferredWidth(125);
				TCancerP.getColumnModel().getColumn(6).setPreferredWidth(95);
				TCancerP.getColumnModel().getColumn(7).setPreferredWidth(147);
				
				
				TCancerP.getTableHeader().setResizingAllowed(false);
				TCancerP.setDefaultEditor(Object.class, null);
				
				
				TCancerP.getTableHeader().setBackground(new Color(189,215,238));
				TCancerP.getTableHeader().setForeground(Color.BLACK);
				TCancerP.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane CancerPs1 = new JScrollPane(TCancerP);
			        CancerPs1.setBounds(9, 55, 796, 385);
			        CancerPs1.setBorder(border);
			        CancerPs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuCancerP = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuCancerP.setBounds(360, 463, 93, 46);
			        MenuCancerP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuCancerP.setForeground(Color.WHITE);
			        
			        JLabel LCancerP = new JLabel("Cancer Patients");
			        LCancerP.setBounds(320, 10, 180, 30);
			        LCancerP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LCancerP.setForeground(Color.BLACK);
			        
			        JLabel CancerPPattern1 = new JLabel();
			        CancerPPattern1.setBounds(103, 446, 350,80);
			        CancerPPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel CancerPPattern2 = new JLabel();
			        CancerPPattern2.setBounds(460, 446, 350,80);
			        CancerPPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel CancerPPattern3 = new JLabel();
			        CancerPPattern3.setBounds(163, 5, 152,47);
			        CancerPPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel CancerPPattern4 = new JLabel();
			        CancerPPattern4.setBounds(495, 5, 152,47);
			        CancerPPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuCancerP.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FCancerP.dispose();
							
						}
			        	
			        });
			        
				
				for (int i = 0; i < TCancerP.getRowCount(); i++) {
					TCancerP.setValueAt(i + 1, i, 0);
		        
				}
			        
			        FCancerP.setLayout(null);
			        FCancerP.add(CancerPs1);
			        FCancerP.add(MenuCancerP);
			        FCancerP.add(CancerPPattern1);
			        FCancerP.add(CancerPPattern2);
			        FCancerP.add(CancerPPattern3);
			        FCancerP.add(CancerPPattern4);
			        FCancerP.add(LCancerP);
			        
			}
	    	
	    }); 
	    
	    int ID5 = 1;
		
        CancerPModel1.addRow(new Object[] {ID5,MehribanCa.getName(),MehribanCa.getSurname(),MehribanCa.getGender(),
        		MehribanCa.getTypeOfDisease(),MehribanCa.getDateOfRegistration(),MehribanCa.getNumber(),MehribanCa.getEmail()});
	
        CancerPModel1.addRow(new Object[] {ID5,SudabeCa.getName(),SudabeCa.getSurname(),SudabeCa.getGender(),
        		SudabeCa.getTypeOfDisease(),SudabeCa.getDateOfRegistration(),SudabeCa.getNumber(),SudabeCa.getEmail()});
        
        CancerPModel1.addRow(new Object[] {ID5,NurayCa.getName(),NurayCa.getSurname(),NurayCa.getGender(),
        		NurayCa.getTypeOfDisease(),NurayCa.getDateOfRegistration(),NurayCa.getNumber(),NurayCa.getEmail()});
	    
	  //Respiratory Patients 
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    RespiratoryPatients MehribanRe = new RespiratoryPatients("Mehriban","Aslanova","Qadın","Respiratory Patient","12.17.2020","050-766-83-**","Meh@gmail.com");
	    RespiratoryPatients SudabeRe = new RespiratoryPatients("Südabə","Bəşirova","Qadın","Respiratory Patient","12.17.2018","055-345-57-**","Sudabe7@mail.ru");
	    RespiratoryPatients NurayRe = new RespiratoryPatients("Nuray","Əsgərova","Qadın","Respiratory Patient","12.17.2020","050-766-83-**","Nuray@gmail.com");
	    
	    DefaultTableModel RespiratoryPModel1 = new DefaultTableModel();
		RespiratoryPModel1.addColumn("ID");
		RespiratoryPModel1.addColumn("Name");
		RespiratoryPModel1.addColumn("Surname");
		RespiratoryPModel1.addColumn("Gender");
		RespiratoryPModel1.addColumn("Type of Disease");
		RespiratoryPModel1.addColumn("Date of Registration");
		RespiratoryPModel1.addColumn("Number");
		RespiratoryPModel1.addColumn("E-mail");
		
		JTable TRespiratoryP = new JTable(RespiratoryPModel1);
		TRespiratoryP.setBounds(9, 55, 796, 387);
		
	    BRespiratoryP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FRespiratoryP = new JFrame();
				FRespiratoryP.setBounds(0, 0, 830, 572);
				FRespiratoryP.getContentPane().setBackground(new Color(242,242,242));
				FRespiratoryP.setLocationRelativeTo(FRespiratoryP);
				FRespiratoryP.setVisible(true);
				FRespiratoryP.setResizable(false);
				
				
				TRespiratoryP.getColumnModel().getColumn(0).setPreferredWidth(25);
				TRespiratoryP.getColumnModel().getColumn(1).setPreferredWidth(97);
				TRespiratoryP.getColumnModel().getColumn(2).setPreferredWidth(97);
				TRespiratoryP.getColumnModel().getColumn(3).setPreferredWidth(97);
				TRespiratoryP.getColumnModel().getColumn(4).setPreferredWidth(109);
				TRespiratoryP.getColumnModel().getColumn(5).setPreferredWidth(125);
				TRespiratoryP.getColumnModel().getColumn(6).setPreferredWidth(95);
				TRespiratoryP.getColumnModel().getColumn(7).setPreferredWidth(147);
				
				
				TRespiratoryP.getTableHeader().setResizingAllowed(false);
				TRespiratoryP.setDefaultEditor(Object.class, null);
				
				
				TRespiratoryP.getTableHeader().setBackground(new Color(189,215,238));
				TRespiratoryP.getTableHeader().setForeground(Color.BLACK);
				TRespiratoryP.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane RespiratoryPs1 = new JScrollPane(TRespiratoryP);
			        RespiratoryPs1.setBounds(9, 55, 796, 385);
			        RespiratoryPs1.setBorder(border);
			        RespiratoryPs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuRespiratoryP = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuRespiratoryP.setBounds(360, 463, 93, 46);
			        MenuRespiratoryP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuRespiratoryP.setForeground(Color.WHITE);
			        
			        JLabel LRespiratoryP = new JLabel("Respiratory Patients");
			        LRespiratoryP.setBounds(298, 10, 220, 30);
			        LRespiratoryP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LRespiratoryP.setForeground(Color.BLACK);
			        
			        JLabel RespiratoryPPattern1 = new JLabel();
			        RespiratoryPPattern1.setBounds(103, 446, 350,80);
			        RespiratoryPPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel RespiratoryPPattern2 = new JLabel();
			        RespiratoryPPattern2.setBounds(460, 446, 350,80);
			        RespiratoryPPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel RespiratoryPPattern3 = new JLabel();
			        RespiratoryPPattern3.setBounds(141, 5, 152,47);
			        RespiratoryPPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel RespiratoryPPattern4 = new JLabel();
			        RespiratoryPPattern4.setBounds(522, 5, 152,47);
			        RespiratoryPPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuRespiratoryP.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FRespiratoryP.dispose();
							
						}
			        	
			        });
			        
			        for (int i = 0; i <TRespiratoryP.getRowCount(); i++) {
			    		TRespiratoryP.setValueAt(i + 1, i, 0);
			        
			    	}
			        
			        FRespiratoryP.setLayout(null);
			        FRespiratoryP.add(RespiratoryPs1);
			        FRespiratoryP.add(MenuRespiratoryP);
			        FRespiratoryP.add(RespiratoryPPattern1);
			        FRespiratoryP.add(RespiratoryPPattern2);
			        FRespiratoryP.add(RespiratoryPPattern3);
			        FRespiratoryP.add(RespiratoryPPattern4);
			        FRespiratoryP.add(LRespiratoryP);
			        
			}
	    	
	    }); 
	   
	    int ID6 = 1;
		
        RespiratoryPModel1.addRow(new Object[] {ID6,MehribanRe.getName(),MehribanRe.getSurname(),MehribanRe.getGender(),
        		MehribanRe.getTypeOfDisease(),MehribanRe.getDateOfRegistration(),MehribanRe.getNumber(),MehribanRe.getEmail()});
	
        RespiratoryPModel1.addRow(new Object[] {ID6,SudabeRe.getName(),SudabeRe.getSurname(),SudabeRe.getGender(),
        		SudabeRe.getTypeOfDisease(),SudabeRe.getDateOfRegistration(),SudabeRe.getNumber(),SudabeRe.getEmail()});
        
        RespiratoryPModel1.addRow(new Object[] {ID6,NurayRe.getName(),NurayRe.getSurname(),NurayRe.getGender(),
        		NurayRe.getTypeOfDisease(),NurayRe.getDateOfRegistration(),NurayRe.getNumber(),NurayRe.getEmail()});
	
	
	

	  //Endocrine Patients 
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    EndocrinePatients MehribanE = new EndocrinePatients("Mehriban","Aslanova","Qadın","Endocrine Patient","12.17.2020","050-766-83-**","Meh@gmail.com");
	    EndocrinePatients SudabeE = new EndocrinePatients("Südabə","Bəşirova","Qadın","Endocrine Patient","12.17.2018","055-345-57-**","Sudabe7@mail.ru");
	    EndocrinePatients NurayE = new EndocrinePatients("Nuray","Əsgərova","Qadın","Endocrine Patient","12.17.2020","050-766-83-**","Nuray@gmail.com");
	    
	    DefaultTableModel EndocPModel1 = new DefaultTableModel();
		EndocPModel1.addColumn("ID");
		EndocPModel1.addColumn("Name");
		EndocPModel1.addColumn("Surname");
		EndocPModel1.addColumn("Gender");
		EndocPModel1.addColumn("Type of Disease");
		EndocPModel1.addColumn("Date of Registration");
		EndocPModel1.addColumn("Number");
		EndocPModel1.addColumn("E-mail");
	    
		JTable TEndocP = new JTable(EndocPModel1);
		TEndocP.setBounds(9, 55, 796, 387);
		
	    BEndocrineP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FEndocP = new JFrame();
				FEndocP.setBounds(0, 0, 830, 572);
				FEndocP.getContentPane().setBackground(new Color(242,242,242));
				FEndocP.setLocationRelativeTo(FEndocP);
				FEndocP.setVisible(true);
				FEndocP.setResizable(false);
				
				
				TEndocP.getColumnModel().getColumn(0).setPreferredWidth(25);
				TEndocP.getColumnModel().getColumn(1).setPreferredWidth(97);
				TEndocP.getColumnModel().getColumn(2).setPreferredWidth(97);
				TEndocP.getColumnModel().getColumn(3).setPreferredWidth(97);
				TEndocP.getColumnModel().getColumn(4).setPreferredWidth(109);
				TEndocP.getColumnModel().getColumn(5).setPreferredWidth(125);
				TEndocP.getColumnModel().getColumn(6).setPreferredWidth(95);
				TEndocP.getColumnModel().getColumn(7).setPreferredWidth(147);
				
				
				TEndocP.getTableHeader().setResizingAllowed(false);
				TEndocP.setDefaultEditor(Object.class, null);
				
				
				TEndocP.getTableHeader().setBackground(new Color(189,215,238));
				TEndocP.getTableHeader().setForeground(Color.BLACK);
				TEndocP.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane EndocPs1 = new JScrollPane(TEndocP);
			        EndocPs1.setBounds(9, 55, 796, 385);
			        EndocPs1.setBorder(border);
			        EndocPs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuEndocP = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuEndocP.setBounds(360, 463, 93, 46);
			        MenuEndocP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuEndocP.setForeground(Color.WHITE);
			        
			        JLabel LEndocP = new JLabel("Endocrine Patients");
			        LEndocP.setBounds(304, 10, 210, 30);
			        LEndocP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LEndocP.setForeground(Color.BLACK);
			        
			        JLabel EndocPPattern1 = new JLabel();
			        EndocPPattern1.setBounds(103, 446, 350,80);
			        EndocPPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel EndocPPattern2 = new JLabel();
			        EndocPPattern2.setBounds(460, 446, 350,80);
			        EndocPPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel EndocPPattern3 = new JLabel();
			        EndocPPattern3.setBounds(147, 5, 152,47);
			        EndocPPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel EndocPPattern4 = new JLabel();
			        EndocPPattern4.setBounds(510, 5, 152,47);
			        EndocPPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuEndocP.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FEndocP.dispose();
							
						}
			        	
			        });
			        
				
				for (int i = 0; i <TEndocP.getRowCount(); i++) {
					TEndocP.setValueAt(i + 1, i, 0);
		        
				}
			        
			        FEndocP.setLayout(null);
			        FEndocP.add(EndocPs1);
			        FEndocP.add(MenuEndocP);
			        FEndocP.add(EndocPPattern1);
			        FEndocP.add(EndocPPattern2);
			        FEndocP.add(EndocPPattern3);
			        FEndocP.add(EndocPPattern4);
			        FEndocP.add(LEndocP);
			        
			}
	    	
	    }); 
	    
	    int ID7 = 1;
		
        EndocPModel1.addRow(new Object[] {ID7,MehribanE.getName(),MehribanE.getSurname(),MehribanE.getGender(),
        		MehribanE.getTypeOfDisease(),MehribanE.getDateOfRegistration(),MehribanE.getNumber(),MehribanE.getEmail()});
	
        EndocPModel1.addRow(new Object[] {ID7,SudabeE.getName(),SudabeE.getSurname(),SudabeE.getGender(),
        		SudabeE.getTypeOfDisease(),SudabeE.getDateOfRegistration(),SudabeE.getNumber(),SudabeE.getEmail()});
        
        EndocPModel1.addRow(new Object[] {ID7,NurayE.getName(),NurayE.getSurname(),NurayE.getGender(),
        		NurayE.getTypeOfDisease(),NurayE.getDateOfRegistration(),NurayE.getNumber(),NurayE.getEmail()});
	    
	  
	  //Neurological Patients 
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    NeurologicalPatients MehribanN = new NeurologicalPatients("Mehriban","Aslanova","Qadın","Neurological Patient","12.17.2020","050-766-83-**","Meh@gmail.com");
	    NeurologicalPatients SudabeN = new NeurologicalPatients("Südabə","Bəşirova","Qadın","Neurological Patient","12.17.2018","055-345-57-**","Sudabe7@mail.ru");
	    NeurologicalPatients NurayN = new NeurologicalPatients("Nuray","Əsgərova","Qadın","Neurological Patient","12.17.2020","050-766-83-**","Nuray@gmail.com");
	    
	    DefaultTableModel NeuroPModel1 = new DefaultTableModel();
		NeuroPModel1.addColumn("ID");
		NeuroPModel1.addColumn("Name");
		NeuroPModel1.addColumn("Surname");
		NeuroPModel1.addColumn("Gender");
		NeuroPModel1.addColumn("Type of Disease");
		NeuroPModel1.addColumn("Date of Registration");
		NeuroPModel1.addColumn("Number");
		NeuroPModel1.addColumn("E-mail");
	    
		JTable TNeuroP = new JTable(NeuroPModel1);
		TNeuroP.setBounds(9, 55, 796, 387);
		
	    BNeuroP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame FNeuroP = new JFrame();
				FNeuroP.setBounds(0, 0, 830, 572);
				FNeuroP.getContentPane().setBackground(new Color(242,242,242));
				FNeuroP.setLocationRelativeTo(FNeuroP);
				FNeuroP.setVisible(true);
				FNeuroP.setResizable(false);
				
				
				JTable TNeuroP = new JTable(NeuroPModel1);
				TNeuroP.setBounds(9, 55, 796, 387);
				
				
				TNeuroP.getColumnModel().getColumn(0).setPreferredWidth(25);
				TNeuroP.getColumnModel().getColumn(1).setPreferredWidth(90);
				TNeuroP.getColumnModel().getColumn(2).setPreferredWidth(90);
				TNeuroP.getColumnModel().getColumn(3).setPreferredWidth(90);
				TNeuroP.getColumnModel().getColumn(4).setPreferredWidth(130);
				TNeuroP.getColumnModel().getColumn(5).setPreferredWidth(125);
				TNeuroP.getColumnModel().getColumn(6).setPreferredWidth(95);
				TNeuroP.getColumnModel().getColumn(7).setPreferredWidth(147);
				
				
				TNeuroP.getTableHeader().setResizingAllowed(false);
				TNeuroP.setDefaultEditor(Object.class, null);
				
				
				TNeuroP.getTableHeader().setBackground(new Color(189,215,238));
				TNeuroP.getTableHeader().setForeground(Color.BLACK);
				TNeuroP.getTableHeader().setReorderingAllowed(false);	  
			        	        
			       
			        JScrollPane NeuroPs1 = new JScrollPane(TNeuroP);
			        NeuroPs1.setBounds(9, 55, 796, 385);
			        NeuroPs1.setBorder(border);
			        NeuroPs1.getViewport().setBackground(Color.WHITE);
			        
			        JButton MenuNeuroP = new RoundedButton("Menu",new Color(51,111,178), 18);
			        MenuNeuroP.setBounds(360, 463, 93, 46);
			        MenuNeuroP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
			        MenuNeuroP.setForeground(Color.WHITE);
			        
			        JLabel LNeuroP = new JLabel("Neurological Patients");
			        LNeuroP.setBounds(290, 10, 235, 30);
			        LNeuroP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
			        LNeuroP.setForeground(Color.BLACK);
			        
			        JLabel NeuroPPattern1 = new JLabel();
			        NeuroPPattern1.setBounds(103, 446, 350,80);
			        NeuroPPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel NeuroPPattern2 = new JLabel();
			        NeuroPPattern2.setBounds(460, 446, 350,80);
			        NeuroPPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel NeuroPPattern3 = new JLabel();
			        NeuroPPattern3.setBounds(133, 5, 152,47);
			        NeuroPPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel NeuroPPattern4 = new JLabel();
			        NeuroPPattern4.setBounds(527, 5, 152,47);
			        NeuroPPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
			        
			        MenuNeuroP.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FNeuroP.dispose();
							
						}
			        	
			        });
			        
                    
				for (int i = 0; i <TNeuroP.getRowCount(); i++) {
					TNeuroP.setValueAt(i + 1, i, 0);
				}
			        
			        FNeuroP.setLayout(null);
			        FNeuroP.add(NeuroPs1);
			        FNeuroP.add(MenuNeuroP);
			        FNeuroP.add(NeuroPPattern1);
			        FNeuroP.add(NeuroPPattern2);
			        FNeuroP.add(NeuroPPattern3);
			        FNeuroP.add(NeuroPPattern4);
			        FNeuroP.add(LNeuroP);
			        
			}
	    	
	    });  
	    
	    int ID8 = 1;
		
        NeuroPModel1.addRow(new Object[] {ID8,MehribanN.getName(),MehribanN.getSurname(),MehribanN.getGender(),
        		MehribanN.getTypeOfDisease(),MehribanN.getDateOfRegistration(),MehribanN.getNumber(),MehribanN.getEmail()});
	
        NeuroPModel1.addRow(new Object[] {ID8,SudabeN.getName(),SudabeN.getSurname(),SudabeN.getGender(),
        		SudabeN.getTypeOfDisease(),SudabeN.getDateOfRegistration(),SudabeN.getNumber(),SudabeN.getEmail()});
        
        NeuroPModel1.addRow(new Object[] {ID8,NurayN.getName(),NurayN.getSurname(),NurayN.getGender(),
        		NurayN.getTypeOfDisease(),NurayN.getDateOfRegistration(),NurayN.getNumber(),NurayN.getEmail()});
	
	    //Skin Patients 
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	  	   
	    SkinPatients MehribanSk = new SkinPatients("Mehriban","Aslanova","Qadın","Skin Patient","12.17.2020","050-766-83-**","Meh@gmail.com");
	    SkinPatients SudabeSk = new SkinPatients("Südabə","Bəşirova","Qadın","Skin Patient","12.17.2018","055-345-57-**","Sudabe7@mail.ru");
	    SkinPatients NuraySk = new SkinPatients("Nuray","Əsgərova","Qadın","Skin Patient","12.17.2020","050-766-83-**","Nuray@gmail.com");
	    
	    DefaultTableModel SkinPModel1 = new DefaultTableModel();
			SkinPModel1.addColumn("ID");
			SkinPModel1.addColumn("Name");
			SkinPModel1.addColumn("Surname");
			SkinPModel1.addColumn("Gender");
			SkinPModel1.addColumn("Type of Disease");
			SkinPModel1.addColumn("Date of Registration");
			SkinPModel1.addColumn("Number");
			SkinPModel1.addColumn("E-mail");
	    
			JTable TSkinP = new JTable(SkinPModel1);
			TSkinP.setBounds(9, 55, 796, 387);
			
	    BSkinP.addActionListener(new ActionListener() {

	  			@Override
	  			public void actionPerformed(ActionEvent e) {
	  				
	  				JFrame FSkinP = new JFrame();
	  				FSkinP.setBounds(0, 0, 830, 572);
	  				FSkinP.getContentPane().setBackground(new Color(242,242,242));
	  				FSkinP.setLocationRelativeTo(FSkinP);
	  				FSkinP.setVisible(true);
	  				FSkinP.setResizable(false);
	  				
	  				
	  				TSkinP.getColumnModel().getColumn(0).setPreferredWidth(25);
	  				TSkinP.getColumnModel().getColumn(1).setPreferredWidth(97);
	  				TSkinP.getColumnModel().getColumn(2).setPreferredWidth(97);
	  				TSkinP.getColumnModel().getColumn(3).setPreferredWidth(97);
	  				TSkinP.getColumnModel().getColumn(4).setPreferredWidth(109);
	  				TSkinP.getColumnModel().getColumn(5).setPreferredWidth(125);
	  				TSkinP.getColumnModel().getColumn(6).setPreferredWidth(95);
	  				TSkinP.getColumnModel().getColumn(7).setPreferredWidth(147);
	  				
	  				
	  				TSkinP.getTableHeader().setResizingAllowed(false);
	  				TSkinP.setDefaultEditor(Object.class, null);
	  				
	  				
	  				TSkinP.getTableHeader().setBackground(new Color(189,215,238));
	  				TSkinP.getTableHeader().setForeground(Color.BLACK);
	  				TSkinP.getTableHeader().setReorderingAllowed(false);	  
	  			        	        
	  			       
	  			        JScrollPane SkinPs1 = new JScrollPane(TSkinP);
	  			        SkinPs1.setBounds(9, 55, 796, 385);
	  			        SkinPs1.setBorder(border);
	  			        SkinPs1.getViewport().setBackground(Color.WHITE);
	  			        
	  			        JButton MenuSkinP = new RoundedButton("Menu",new Color(51,111,178), 18);
	  			        MenuSkinP.setBounds(360, 463, 93, 46);
	  			        MenuSkinP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
	  			        MenuSkinP.setForeground(Color.WHITE);
	  			        
	  			        JLabel LSkinP = new JLabel("Skin Patients");
	  			        LSkinP.setBounds(337, 10, 160, 30);
	  			        LSkinP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
	  			        LSkinP.setForeground(Color.BLACK);
	  			        
	  			        JLabel SkinPPattern1 = new JLabel();
	  			        SkinPPattern1.setBounds(103, 446, 350,80);
	  			        SkinPPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
	  			        
	  			        JLabel SkinPPattern2 = new JLabel();
	  			        SkinPPattern2.setBounds(460, 446, 350,80);
	  			        SkinPPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
	  			        
	  			        JLabel SkinPPattern3 = new JLabel();
	  			        SkinPPattern3.setBounds(180, 5, 152,47);
	  			        SkinPPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
	  			        
	  			        JLabel SkinPPattern4 = new JLabel();
	  			        SkinPPattern4.setBounds(482, 5, 152,47);
	  			        SkinPPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
	  			        
	  			        MenuSkinP.addActionListener(new ActionListener() {

	  						@Override
	  						public void actionPerformed(ActionEvent e) {
	  							FSkinP.dispose();
	  							
	  						}
	  			        	
	  			        });
	  			        
	  			        
					for (int i = 0; i <TSkinP.getRowCount(); i++) {
						TSkinP.setValueAt(i + 1, i, 0);
					}
	  			        
	  			        FSkinP.setLayout(null);
	  			        FSkinP.add(SkinPs1);
	  			        FSkinP.add(MenuSkinP);
	  			        FSkinP.add(SkinPPattern1);
	  			        FSkinP.add(SkinPPattern2);
	  			        FSkinP.add(SkinPPattern3);
	  			        FSkinP.add(SkinPPattern4);
	  			        FSkinP.add(LSkinP);
	  			        
	  			}
	  	    	
	  	    });
	  	    
	      int ID9 = 1;
		
	      SkinPModel1.addRow(new Object[] {ID9,MehribanSk.getName(),MehribanSk.getSurname(),MehribanSk.getGender(),
	    		MehribanSk.getTypeOfDisease(),MehribanSk.getDateOfRegistration(),MehribanSk.getNumber(),MehribanSk.getEmail()});
		
	      SkinPModel1.addRow(new Object[] {ID9,SudabeSk.getName(),SudabeSk.getSurname(),SudabeSk.getGender(),
	    		SudabeSk.getTypeOfDisease(),SudabeSk.getDateOfRegistration(),SudabeSk.getNumber(),SudabeSk.getEmail()});
          
	      SkinPModel1.addRow(new Object[] {ID9,NuraySk.getName(),NuraySk.getSurname(),NuraySk.getGender(),
	    		NuraySk.getTypeOfDisease(),NuraySk.getDateOfRegistration(),NuraySk.getNumber(),NuraySk.getEmail()});
	  
	  	    
	  	//Mental Patients 
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	  	  
	    MentalPatients MehribanM = new MentalPatients("Mehriban","Aslanova","Qadın","Mental Patient","12.17.2020","050-766-83-**","Meh@gmail.com");
	    MentalPatients SudabeM = new MentalPatients("Südabə","Bəşirova","Qadın","Mental Patient","12.17.2018","055-345-57-**","Sudabe7@mail.ru");
	    MentalPatients NurayM = new MentalPatients("Nuray","Əsgərova","Qadın","Mental Patient","12.17.2020","050-766-83-**","Nuray@gmail.com");
	    
	    DefaultTableModel MentalPModel1 = new DefaultTableModel();
			MentalPModel1.addColumn("ID");
			MentalPModel1.addColumn("Name");
			MentalPModel1.addColumn("Surname");
			MentalPModel1.addColumn("Gender");
			MentalPModel1.addColumn("Type of Disease");
			MentalPModel1.addColumn("Date of Registration");
			MentalPModel1.addColumn("Number");
			MentalPModel1.addColumn("E-mail");
	    
			JTable TMentalP = new JTable(MentalPModel1);
			TMentalP.setBounds(9, 55, 796, 387);
			
	    BMentalP.addActionListener(new ActionListener() {

	  			@Override
	  			public void actionPerformed(ActionEvent e) {
	  				
	  				JFrame FMentalP = new JFrame();
	  				FMentalP.setBounds(0, 0, 830, 572);
	  				FMentalP.getContentPane().setBackground(new Color(242,242,242));
	  				FMentalP.setLocationRelativeTo(FMentalP);
	  				FMentalP.setVisible(true);
	  				FMentalP.setResizable(false);
	  				
	  				TMentalP.getColumnModel().getColumn(0).setPreferredWidth(25);
	  				TMentalP.getColumnModel().getColumn(1).setPreferredWidth(97);
	  				TMentalP.getColumnModel().getColumn(2).setPreferredWidth(97);
	  				TMentalP.getColumnModel().getColumn(3).setPreferredWidth(97);
	  				TMentalP.getColumnModel().getColumn(4).setPreferredWidth(109);
	  				TMentalP.getColumnModel().getColumn(5).setPreferredWidth(125);
	  				TMentalP.getColumnModel().getColumn(6).setPreferredWidth(95);
	  				TMentalP.getColumnModel().getColumn(7).setPreferredWidth(147);
	  				
	  				
	  				TMentalP.getTableHeader().setResizingAllowed(false);
	  				TMentalP.setDefaultEditor(Object.class, null);
	  				
	  				
	  				TMentalP.getTableHeader().setBackground(new Color(189,215,238));
	  				TMentalP.getTableHeader().setForeground(Color.BLACK);
	  				TMentalP.getTableHeader().setReorderingAllowed(false);	  
	  			        	        
	  			       
	  			        JScrollPane MentalPs1 = new JScrollPane(TMentalP);
	  			        MentalPs1.setBounds(9, 55, 796, 385);
	  			        MentalPs1.setBorder(border);
	  			        MentalPs1.getViewport().setBackground(Color.WHITE);
	  			        
	  			        JButton MenuMentalP = new RoundedButton("Menu",new Color(51,111,178), 18);
	  			        MenuMentalP.setBounds(360, 463, 93, 46);
	  			        MenuMentalP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
	  			        MenuMentalP.setForeground(Color.WHITE);
	  			        
	  			        JLabel LMentalP = new JLabel("Mental Patients");
	  			        LMentalP.setBounds(320, 10, 180, 30);
	  			        LMentalP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
	  			        LMentalP.setForeground(Color.BLACK);
				        
				        JLabel MentalPPattern1 = new JLabel();
				        MentalPPattern1.setBounds(103, 446, 350,80);
				        MentalPPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
				        
				        JLabel MentalPPattern2 = new JLabel();
				        MentalPPattern2.setBounds(460, 446, 350,80);
				        MentalPPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
				        
				        JLabel MentalPPattern3 = new JLabel();
				        MentalPPattern3.setBounds(163, 5, 152,47);
				        MentalPPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
				        
				        JLabel MentalPPattern4 = new JLabel();
				        MentalPPattern4.setBounds(495, 5, 152,47);
				        MentalPPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
	  			        
	  			        MenuMentalP.addActionListener(new ActionListener() {

	  						@Override
	  						public void actionPerformed(ActionEvent e) {
	  							FMentalP.dispose();
	  							
	  						}
	  			        	
	  			        });
	  			        
	  			      
					for (int i = 0; i <TMentalP.getRowCount(); i++) {
						TMentalP.setValueAt(i + 1, i, 0);
					}
	  			        
	  			       FMentalP.setLayout(null);
	  			       FMentalP.add(MentalPs1);
	  			       FMentalP.add(MenuMentalP);
	  			       FMentalP.add(MentalPPattern1);
	  			       FMentalP.add(MentalPPattern2);
	  			       FMentalP.add(MentalPPattern3);
	  			       FMentalP.add(MentalPPattern4);
	  			       FMentalP.add(LMentalP);
	  			        
	  			}
	  	    	
	  	    }); 
	    
	      int ID10 = 1;
		
	      MentalPModel1.addRow(new Object[] {ID10,MehribanM.getName(),MehribanM.getSurname(),MehribanM.getGender(),
	    		MehribanM.getTypeOfDisease(),MehribanM.getDateOfRegistration(),MehribanM.getNumber(),MehribanM.getEmail()});
		
	      MentalPModel1.addRow(new Object[] {ID10,SudabeM.getName(),SudabeM.getSurname(),SudabeM.getGender(),
	    		SudabeM.getTypeOfDisease(),SudabeM.getDateOfRegistration(),SudabeM.getNumber(),SudabeM.getEmail()});
          
	      MentalPModel1.addRow(new Object[] {ID10,NurayM.getName(),NurayM.getSurname(),NurayM.getGender(),
	    		NurayM.getTypeOfDisease(),NurayM.getDateOfRegistration(),NurayM.getNumber(),NurayM.getEmail()});
	    
	    
	    
        //Services
	    //Laboratory
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    BLaboratoryS.addActionListener(new ActionListener() {

  			@Override
  			public void actionPerformed(ActionEvent e) {
  				
  				JFrame FLabS = new JFrame();
  				FLabS.setBounds(0, 0, 830, 572);
  				FLabS.getContentPane().setBackground(new Color(242,242,242));
  				FLabS.setLocationRelativeTo(FLabS);
  				FLabS.setVisible(true);
  				FLabS.setResizable(false);
  				
  				
  				JLabel lab1 = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\lab.png"));
  				lab1.setBounds(15, 75, 270, 170);
  				
  				JLabel labText = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\LabText.png"));
  				labText.setBounds(192, 10, 700, 400);
  				
  				JLabel labList = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\LabList.png"));
  				labList.setBounds(23, 245, 230, 200);
  				
  				JLabel labFee = new JLabel("Service fee: 70 $");
  				labFee.setBounds(338, 425, 150, 15);
  				labFee.setForeground(new Color(56,87,35));
  				labFee.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
  			
  			        
  			        JButton MenuLabS = new RoundedButton("Menu",new Color(51,111,178), 18);
  			        MenuLabS.setBounds(360, 463, 93, 46);
  			        MenuLabS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
  			        MenuLabS.setForeground(Color.WHITE);
  			        
  			        JLabel LLabS = new JLabel("Laboratory");
  			        LLabS.setBounds(348, 10, 150, 30);
  			        LLabS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
  			        LLabS.setForeground(Color.BLACK);
			        
			        JLabel LabSPattern1 = new JLabel();
			        LabSPattern1.setBounds(103, 446, 350,80);
			        LabSPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel LabSPattern2 = new JLabel();
			        LabSPattern2.setBounds(460, 446, 350,80);
			        LabSPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel LabSPattern3 = new JLabel();
			        LabSPattern3.setBounds(182, 5, 152,47);
			        LabSPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel LabSPattern4 = new JLabel();
			        LabSPattern4.setBounds(478, 5, 152,47);
			        LabSPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
  			        
  			        MenuLabS.addActionListener(new ActionListener() {

  						@Override
  						public void actionPerformed(ActionEvent e) {
  							FLabS.dispose();
  							
  						}
  			        	
  			        });
  			        
  			        
  			       FLabS.setLayout(null);
  			       FLabS.add(MenuLabS);
  			       FLabS.add(LabSPattern1);
  			       FLabS.add(LabSPattern2);
  			       FLabS.add(LabSPattern3);
  			       FLabS.add(LabSPattern4);
  			       FLabS.add(LLabS);
  			       FLabS.add(lab1);
  			       FLabS.add(labText);
  			       FLabS.add(labFee); 
  			       FLabS.add(labList);
  			        
  			}
  	    	
  	    });
	    
	    
	  //Uroology
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    BUrologyS.addActionListener(new ActionListener() {

  			@Override
  			public void actionPerformed(ActionEvent e) {
  				
  				JFrame FUrologyS = new JFrame();
  				FUrologyS.setBounds(0, 0, 830, 572);
  				FUrologyS.getContentPane().setBackground(new Color(242,242,242));
  				FUrologyS.setLocationRelativeTo(FUrologyS);
  				FUrologyS.setVisible(true);
  				FUrologyS.setResizable(false);
  				
  				
  				JLabel uro1 = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\Urology.png"));
  				uro1.setBounds(15, 75, 270, 170);
  				
  				JLabel uroText = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\UroText.png"));
  				uroText.setBounds(192, 10, 700, 427);
  				
  				JLabel uroList = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\UroList.png"));
  				uroList.setBounds(23, 245, 170, 200);
  				
  				JLabel uroFee = new JLabel("Service fee: 190 $");
  				uroFee.setBounds(338, 425, 150, 15);
  				uroFee.setForeground(new Color(56,87,35));
  				uroFee.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
  			
  			        
  			        JButton MenuUroS = new RoundedButton("Menu",new Color(51,111,178), 18);
  			        MenuUroS.setBounds(360, 463, 93, 46);
  			        MenuUroS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
  			        MenuUroS.setForeground(Color.WHITE);
  			        
  			        JLabel LUroS = new JLabel("Urology");
  			        LUroS.setBounds(362, 8, 120, 35);
  			        LUroS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
  			        LUroS.setForeground(Color.BLACK);
			        
			        JLabel UroSPattern1 = new JLabel();
			        UroSPattern1.setBounds(103, 446, 350,80);
			        UroSPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel UroSPattern2 = new JLabel();
			        UroSPattern2.setBounds(460, 446, 350,80);
			        UroSPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel UroSPattern3 = new JLabel();
			        UroSPattern3.setBounds(196, 5, 152,47);
			        UroSPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel UroSPattern4 = new JLabel();
			        UroSPattern4.setBounds(462, 5, 152,47);
			        UroSPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
  			        
  			        MenuUroS.addActionListener(new ActionListener() {

  						@Override
  						public void actionPerformed(ActionEvent e) {
  							FUrologyS.dispose();
  							
  						}
  			        	
  			        });
  			        
  			        
  			      FUrologyS.setLayout(null);
  			      FUrologyS.add(MenuUroS);
  			      FUrologyS.add(UroSPattern1);
  			      FUrologyS.add(UroSPattern2);
  			      FUrologyS.add(UroSPattern3);
  			      FUrologyS.add(UroSPattern4);
  			      FUrologyS.add(LUroS);
  			      FUrologyS.add(uro1);
  			      FUrologyS.add(uroText);
  			      FUrologyS.add(uroFee); 
  			      FUrologyS.add(uroList);
  			        
  			}
  	    	
  	    });  
	    
	    
	  //Dentistry
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    BDentistryS.addActionListener(new ActionListener() {

  			@Override
  			public void actionPerformed(ActionEvent e) {
  				
  				JFrame FDenS = new JFrame();
  				FDenS.setBounds(0, 0, 830, 572);
  				FDenS.getContentPane().setBackground(new Color(242,242,242));
  				FDenS.setLocationRelativeTo(FDenS);
  				FDenS.setVisible(true);
  				FDenS.setResizable(false);
  				
  				
  				JLabel den1 = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\Dentistry.png"));
  				den1.setBounds(15, 75, 270, 170);
  				
  				JLabel denText = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\DenText.png"));
  				denText.setBounds(192, 10, 700, 440);
  				
  				JLabel denList = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\DenList.png"));
  				denList.setBounds(23, 245, 190, 200);
  				JLabel denFee = new JLabel("Service fee: 315 $");
  				denFee.setBounds(338, 425, 150, 15);
  				denFee.setForeground(new Color(56,87,35));
  				denFee.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
  			
  			        
  			        JButton MenuDenS = new RoundedButton("Menu",new Color(51,111,178), 18);
  			        MenuDenS.setBounds(360, 463, 93, 46);
  			        MenuDenS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
  			        MenuDenS.setForeground(Color.WHITE);
  			        
  			        JLabel LDenS = new JLabel("Dentistry");
  			        LDenS.setBounds(356, 8, 130, 35);
  			        LDenS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
  			        LDenS.setForeground(Color.BLACK);
			        
			        JLabel DenSPattern1 = new JLabel();
			        DenSPattern1.setBounds(103, 446, 350,80);
			        DenSPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel DenSPattern2 = new JLabel();
			        DenSPattern2.setBounds(460, 446, 350,80);
			        DenSPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel DenSPattern3 = new JLabel();
			        DenSPattern3.setBounds(190, 5, 152,47);
			        DenSPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel DenSPattern4 = new JLabel();
			        DenSPattern4.setBounds(468, 5, 152,47);
			        DenSPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
  			        
  			        MenuDenS.addActionListener(new ActionListener() {

  						@Override
  						public void actionPerformed(ActionEvent e) {
  							FDenS.dispose();
  							
  						}
  			        	
  			        });
  			        
  			        
  			      FDenS.setLayout(null);
  			      FDenS.add(MenuDenS);
  			      FDenS.add(DenSPattern1);
  			      FDenS.add(DenSPattern2);
  			      FDenS.add(DenSPattern3);
  			      FDenS.add(DenSPattern4);
  			      FDenS.add(LDenS);
  			      FDenS.add(den1);
  			      FDenS.add(denText);
  			      FDenS.add(denFee); 
  			      FDenS.add(denList);
  			        
  			}
  	    	
  	    });  
	    
	    
	  //Pediatrics
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    BPediatricS.addActionListener(new ActionListener() {

  			@Override
  			public void actionPerformed(ActionEvent e) {
  				
  				JFrame FPedS = new JFrame();
  				FPedS.setBounds(0, 0, 830, 572);
  				FPedS.getContentPane().setBackground(new Color(242,242,242));
  				FPedS.setLocationRelativeTo(FPedS);
  				FPedS.setVisible(true);
  				FPedS.setResizable(false);
  				
  				
  				JLabel ped1 = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\Pediatrics.png"));
  				ped1.setBounds(15, 75, 270, 170);
  				
  				JLabel pedText = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\PedText.png"));
  				pedText.setBounds(192, 10, 700, 440);
  				
  				JLabel pedList = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\PedList.png"));
  				pedList.setBounds(23, 245, 210, 200);
  				
  				JLabel pedFee = new JLabel("Service fee: 260 $");
  				pedFee.setBounds(338, 425, 150, 15);
  				pedFee.setForeground(new Color(56,87,35));
  				pedFee.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
  			
  			        
  			        JButton MenuPedS = new RoundedButton("Menu",new Color(51,111,178), 18);
  			        MenuPedS.setBounds(360, 463, 93, 46);
  			        MenuPedS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
  			        MenuPedS.setForeground(Color.WHITE);
  			        
  			        JLabel LPedS = new JLabel("Pediatrics");
  			        LPedS.setBounds(355, 8, 130, 35);
  			        LPedS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
  			        LPedS.setForeground(Color.BLACK);
			        
			        JLabel PedSPattern1 = new JLabel();
			        PedSPattern1.setBounds(103, 446, 350,80);
			        PedSPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel PedSPattern2 = new JLabel();
			        PedSPattern2.setBounds(460, 446, 350,80);
			        PedSPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel PedSPattern3 = new JLabel();
			        PedSPattern3.setBounds(189, 5, 152,47);
			        PedSPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel PedSPattern4 = new JLabel();
			        PedSPattern4.setBounds(471, 5, 152,47);
			        PedSPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
  			        
  			        MenuPedS.addActionListener(new ActionListener() {

  						@Override
  						public void actionPerformed(ActionEvent e) {
  							FPedS.dispose();
  							
  						}
  			        	
  			        });
  			        
  			        
  			      FPedS.setLayout(null);
  			      FPedS.add(MenuPedS);
  			      FPedS.add(PedSPattern1);
  			      FPedS.add(PedSPattern2);
  			      FPedS.add(PedSPattern3);
  			      FPedS.add(PedSPattern4);
  			      FPedS.add(LPedS);
  			      FPedS.add(ped1);
  			      FPedS.add(pedText);
  			      FPedS.add(pedFee); 
  			      FPedS.add(pedList);
  			        
  			}
  	    	
  	    }); 
	    
	    
	    
	  //Therapy
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    BTherapyS.addActionListener(new ActionListener() {

  			@Override
  			public void actionPerformed(ActionEvent e) {
  				
  				JFrame FTherS = new JFrame();
  				FTherS.setBounds(0, 0, 830, 572);
  				FTherS.getContentPane().setBackground(new Color(242,242,242));
  				FTherS.setLocationRelativeTo(FTherS);
  				FTherS.setVisible(true);
  				FTherS.setResizable(false);
  				
  				
  				JLabel ther1 = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\Therapy.png"));
  				ther1.setBounds(15, 75, 270, 170);
  				
  				JLabel therText = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\TherText.png"));
  				therText.setBounds(192, 10, 700, 420);
  				
  				JLabel therList = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\TherList.png"));
  				therList.setBounds(23, 245, 210, 200);
  				
  				JLabel therFee = new JLabel("Service fee: 280 $");
  				therFee.setBounds(338, 425, 150, 15);
  				therFee.setForeground(new Color(56,87,35));
  				therFee.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
  			
  			        
  			        JButton MenuTherS = new RoundedButton("Menu",new Color(51,111,178), 18);
  			        MenuTherS.setBounds(360, 463, 93, 46);
  			        MenuTherS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
  			        MenuTherS.setForeground(Color.WHITE);
  			        
  			        JLabel LTherS = new JLabel("Therapy");
  			        LTherS.setBounds(360, 8, 100, 35);
  			        LTherS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
  			        LTherS.setForeground(Color.BLACK);
			        
			        JLabel TherSPattern1 = new JLabel();
			        TherSPattern1.setBounds(103, 446, 350,80);
			        TherSPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel TherSPattern2 = new JLabel();
			        TherSPattern2.setBounds(460, 446, 350,80);
			        TherSPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel TherSPattern3 = new JLabel();
			        TherSPattern3.setBounds(194, 5, 152,47);
			        TherSPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel TherSPattern4 = new JLabel();
			        TherSPattern4.setBounds(463, 5, 152,47);
			        TherSPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
  			        
  			        MenuTherS.addActionListener(new ActionListener() {

  						@Override
  						public void actionPerformed(ActionEvent e) {
  							FTherS.dispose();
  							
  						}
  			        	
  			        });
  			        
  			        
  			      FTherS.setLayout(null);
  			      FTherS.add(MenuTherS);
  			      FTherS.add(TherSPattern1);
  			      FTherS.add(TherSPattern2);
  			      FTherS.add(TherSPattern3);
  			      FTherS.add(TherSPattern4);
  			      FTherS.add(LTherS);
  			      FTherS.add(ther1);
  			      FTherS.add(therText);
  			      FTherS.add(therFee); 
  			      FTherS.add(therList);
  			        
  			}
  	    	
  	    }); 
	   
	    
	  //Reanimation
 //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    BReanimationS.addActionListener(new ActionListener() {

  			@Override
  			public void actionPerformed(ActionEvent e) {
  				
  				JFrame FReanS = new JFrame();
  				FReanS.setBounds(0, 0, 830, 572);
  				FReanS.getContentPane().setBackground(new Color(242,242,242));
  				FReanS.setLocationRelativeTo(FReanS);
  				FReanS.setVisible(true);
  				FReanS.setResizable(false);
  				
  				
  				JLabel rean1 = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\Reanimation.png"));
  				rean1.setBounds(15, 75, 270, 170);
  				
  				JLabel reanText = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\ReanText.png"));
  				reanText.setBounds(192, 10, 700, 405);
  				
  				JLabel reanList = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\ReanList.png"));
  				reanList.setBounds(23, 245, 270, 200);
  				
  				JLabel reanFee = new JLabel("Service fee: 270 $");
  				reanFee.setBounds(338, 425, 150, 15);
  				reanFee.setForeground(new Color(56,87,35));
  				reanFee.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
  			
  			        
  			        JButton MenuReanS = new RoundedButton("Menu",new Color(51,111,178), 18);
  			        MenuReanS.setBounds(360, 463, 93, 46);
  			        MenuReanS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
  			        MenuReanS.setForeground(Color.WHITE);
  			        
  			        JLabel LReanS = new JLabel("Reanimation");
  			        LReanS.setBounds(338, 8, 140, 35);
  			        LReanS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
  			        LReanS.setForeground(Color.BLACK);
			        
			        JLabel ReanSPattern1 = new JLabel();
			        ReanSPattern1.setBounds(103, 446, 350,80);
			        ReanSPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel ReanSPattern2 = new JLabel();
			        ReanSPattern2.setBounds(460, 446, 350,80);
			        ReanSPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel ReanSPattern3 = new JLabel();
			        ReanSPattern3.setBounds(172, 5, 152,47);
			        ReanSPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel ReanSPattern4 = new JLabel();
			        ReanSPattern4.setBounds(488, 5, 152,47);
			        ReanSPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
  			        
  			        MenuReanS.addActionListener(new ActionListener() {

  						@Override
  						public void actionPerformed(ActionEvent e) {
  							FReanS.dispose();
  							
  						}
  			        	
  			        });
  			        
  			        
  			      FReanS.setLayout(null);
  			      FReanS.add(MenuReanS);
  			      FReanS.add(ReanSPattern1);
  			      FReanS.add(ReanSPattern2);
  			      FReanS.add(ReanSPattern3);
  			      FReanS.add(ReanSPattern4);
  			      FReanS.add(LReanS);
  			      FReanS.add(rean1);
  			      FReanS.add(reanText);
  			      FReanS.add(reanFee); 
  			      FReanS.add(reanList);
  			        
  			}
  	    	
  	    }); 
	    
	    
	  //General Surgery
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    BGenSurgS.addActionListener(new ActionListener() {

  			@Override
  			public void actionPerformed(ActionEvent e) {
  				
  				JFrame FGenSurS = new JFrame();
  				FGenSurS.setBounds(0, 0, 830, 572);
  				FGenSurS.getContentPane().setBackground(new Color(242,242,242));
  				FGenSurS.setLocationRelativeTo(FGenSurS);
  				FGenSurS.setVisible(true);
  				FGenSurS.setResizable(false);
  				
  				
  				JLabel gen1 = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\General.png"));
  				gen1.setBounds(15, 75, 270, 170);
  				
  				JLabel genText = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\GenText.png"));
  				genText.setBounds(192, 10, 700, 420);
  				
  				JLabel genList = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\GenList.png"));
  				genList.setBounds(23, 245, 260, 200);
  				
  				JLabel genFee = new JLabel("Service fee: 550 $");
  				genFee.setBounds(338, 425, 150, 15);
  				genFee.setForeground(new Color(56,87,35));
  				genFee.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
  			
  			        
  			        JButton MenuGenS = new RoundedButton("Menu",new Color(51,111,178), 18);
  			        MenuGenS.setBounds(360, 463, 93, 46);
  			        MenuGenS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
  			        MenuGenS.setForeground(Color.WHITE);
  			        
  			        JLabel LGenS = new JLabel("General Surgery");
  			        LGenS.setBounds(317, 8, 180, 35);
  			        LGenS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
  			        LGenS.setForeground(Color.BLACK);
			        
			        JLabel GenSPattern1 = new JLabel();
			        GenSPattern1.setBounds(103, 446, 350,80);
			        GenSPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel GenSPattern2 = new JLabel();
			        GenSPattern2.setBounds(460, 446, 350,80);
			        GenSPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel GenSPattern3 = new JLabel();
			        GenSPattern3.setBounds(151, 5, 152,47);
			        GenSPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel GenSPattern4 = new JLabel();
			        GenSPattern4.setBounds(504, 5, 152,47);
			        GenSPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
  			        
  			        MenuGenS.addActionListener(new ActionListener() {

  						@Override
  						public void actionPerformed(ActionEvent e) {
  							FGenSurS.dispose();
  							
  						}
  			        	
  			        });
  			        
  			        
  			      FGenSurS.setLayout(null);
  			      FGenSurS.add(MenuGenS);
  			      FGenSurS.add(GenSPattern1);
  			      FGenSurS.add(GenSPattern2);
  			      FGenSurS.add(GenSPattern3);
  			      FGenSurS.add(GenSPattern4);
  			      FGenSurS.add(LGenS);
  			      FGenSurS.add(gen1);
  			      FGenSurS.add(genText);
  			      FGenSurS.add(genFee); 
  			      FGenSurS.add(genList);
  			        
  			}
  	    	
  	    });  
	    
	    
	  //Ambulance
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    BAmbulanceS.addActionListener(new ActionListener() {

  			@Override
  			public void actionPerformed(ActionEvent e) {
  				
  				JFrame FAmbS = new JFrame();
  				FAmbS.setBounds(0, 0, 830, 572);
  				FAmbS.getContentPane().setBackground(new Color(242,242,242));
  				FAmbS.setLocationRelativeTo(FAmbS);
  				FAmbS.setVisible(true);
  				FAmbS.setResizable(false);
  				
  				
  				JLabel amb1 = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\Ambulance.png"));
  				amb1.setBounds(15, 75, 270, 170);
  				
  				JLabel ambText = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\AmbText.png"));
  				ambText.setBounds(192, 0, 700, 485);
  				
  				JLabel ambList = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\AmbList.png"));
  				ambList.setBounds(23, 245, 260, 200);
  				
  				JLabel ambFee = new JLabel("Service fee: 155 $");
  				ambFee.setBounds(338, 425, 150, 15);
  				ambFee.setForeground(new Color(56,87,35));
  				ambFee.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
  			
  			        
  			        JButton MenuAmbS = new RoundedButton("Menu",new Color(51,111,178), 18);
  			        MenuAmbS.setBounds(360, 463, 93, 46);
  			        MenuAmbS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
  			        MenuAmbS.setForeground(Color.WHITE);
  			        
  			        JLabel LAmbS = new JLabel("Ambulance");
  			        LAmbS.setBounds(347, 8, 140, 35);
  			        LAmbS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
  			        LAmbS.setForeground(Color.BLACK);
			        
			        JLabel AmbSPattern1 = new JLabel();
			        AmbSPattern1.setBounds(103, 446, 350,80);
			        AmbSPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel AmbSPattern2 = new JLabel();
			        AmbSPattern2.setBounds(460, 446, 350,80);
			        AmbSPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel AmbSPattern3 = new JLabel();
			        AmbSPattern3.setBounds(182, 5, 152,47);
			        AmbSPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel AmbSPattern4 = new JLabel();
			        AmbSPattern4.setBounds(481, 5, 152,47);
			        AmbSPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
  			        
  			        MenuAmbS.addActionListener(new ActionListener() {

  						@Override
  						public void actionPerformed(ActionEvent e) {
  							FAmbS.dispose();
  							
  						}
  			        	
  			        });
  			        
  			        
  			        
  			      FAmbS.setLayout(null);
  			      FAmbS.add(MenuAmbS);
  			      FAmbS.add(AmbSPattern1);
  			      FAmbS.add(AmbSPattern2);
  			      FAmbS.add(AmbSPattern3);
  			      FAmbS.add(AmbSPattern4);
  			      FAmbS.add(LAmbS);
  			      FAmbS.add(amb1);
  			      FAmbS.add(ambText);
  			      FAmbS.add(ambFee); 
  			      FAmbS.add(ambList);
  			        
  			}
  	    	
  	    }); 
	    
	    
	  //Add Worker
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    BAddWorker.addActionListener(new ActionListener() {

  			@Override
  			public void actionPerformed(ActionEvent e) {
  				
  				JFrame FAddWS = new JFrame();
  				FAddWS.setBounds(0, 0, 830, 572);
  				FAddWS.getContentPane().setBackground(new Color(242,242,242));
  				FAddWS.setLocationRelativeTo(FAddWS);
  				FAddWS.setVisible(true);
  				FAddWS.setResizable(false);
  				
  				
  				JLabel NameWL = new JLabel("Name:");
  				NameWL.setBounds(110, 90, 60, 20);
  				NameWL.setFont(new Font("Calibri", Font.PLAIN, 19));
  				
  				JTextArea NameWT = new JTextArea();
  				NameWT.setBounds(107, 111, 166, 21);
  				NameWT.setBorder(border);
  				
  				JLabel SurWL = new JLabel("Surname:");
  				SurWL.setBounds(110, 149, 90, 20);
  				SurWL.setFont(new Font("Calibri", Font.PLAIN, 19));
  				
  				JTextArea SurWT = new JTextArea();
  				SurWT.setBounds(107, 170, 166, 21);
  				SurWT.setBorder(border);
  				
  				JLabel GenderWL = new JLabel("Gender:");
  				GenderWL.setBounds(110, 208, 90, 20);
  				GenderWL.setFont(new Font("Calibri", Font.PLAIN, 19));
  				
  				JRadioButton MaleW = new JRadioButton("Male");
  				MaleW.setBounds(117, 233, 70, 20);
  				MaleW.setFont(new Font("Calibri", Font.PLAIN, 18));
  				MaleW.setBackground(new Color(242,242,242));
  				
  				JRadioButton FemaleW = new JRadioButton("Female");
  				FemaleW.setBounds(190, 233, 90, 20);
  				FemaleW.setFont(new Font("Calibri", Font.PLAIN, 18));
  				FemaleW.setBackground(new Color(242,242,242));
  				
  				ButtonGroup bgw = new ButtonGroup();
  				bgw.add(MaleW);
  				bgw.add(FemaleW);
  				
  				JLabel SpecWL = new JLabel("Specialization:");
  				SpecWL.setBounds(110, 273, 130, 20);
  				SpecWL.setFont(new Font("Calibri", Font.PLAIN, 19));
  				
  				String[] Specs = {"Chief Physician","Doctor","Dentist","Nurse","Receptionist","Security","Housekeeper"};
  				
  				JComboBox<String> SpecWC = new JComboBox<>(Specs);
  				SpecWC.setBounds(107, 294, 166, 22);
  				Font largerFont = SpecWC.getFont().deriveFont(Font.BOLD, 14); 
  		        SpecWC.setFont(largerFont);
  		        
  		        JLabel DateWL = new JLabel("Date:");
  		        DateWL.setBounds(110, 331, 130, 20);
  		        DateWL.setFont(new Font("Calibri", Font.PLAIN, 19));
  		        
  		        JDateChooser DateW = new JDateChooser();
  		        DateW.setBounds(107, 352, 166, 23);
  		        
  		        JLabel ExpWL = new JLabel("Experience:");
  		        ExpWL.setBounds(490, 90, 90, 20);
  		        ExpWL.setFont(new Font("Calibri", Font.PLAIN, 19));
				
				JTextArea ExpWT = new JTextArea();
				ExpWT.setBounds(487, 111, 166, 21);
				ExpWT.setBorder(border);
				
				JLabel PriceWL = new JLabel("Price of Appointment:");
				PriceWL.setBounds(490, 149, 170, 20);
				PriceWL.setFont(new Font("Calibri", Font.PLAIN, 18));
				
				JTextArea PriceWT = new JTextArea();
				PriceWT.setBounds(487, 170, 166, 21);
				PriceWT.setBorder(border);
				
				JLabel SalaryWL = new JLabel("Salary:");
				SalaryWL.setBounds(490, 208, 90, 20);
				SalaryWL.setFont(new Font("Calibri", Font.PLAIN, 19));
				
				JTextArea SalaryWT = new JTextArea();
				SalaryWT.setBounds(487, 229, 166, 21);
				SalaryWT.setBorder(border);
				
				JLabel DollarWL = new JLabel("$");
				DollarWL.setBounds(660, 232, 90, 20);
				DollarWL.setFont(new Font("Calibri", Font.PLAIN, 19));
				
				JLabel Dollar = new JLabel("$");
				Dollar.setBounds(660, 173, 90, 20);
				Dollar.setFont(new Font("Calibri", Font.PLAIN, 19));
  				
  			        
  			        JButton MenuAddWS = new RoundedButton("Menu",new Color(51,111,178), 18);
  			        MenuAddWS.setBounds(360, 463, 93, 46);
  			        MenuAddWS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
  			        MenuAddWS.setForeground(Color.WHITE);
  			        
  			        JLabel LAddWS = new JLabel("Add Worker");
  			        LAddWS.setBounds(347, 8, 140, 35);
  			        LAddWS.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
  			        LAddWS.setForeground(Color.BLACK);
			        
			        JLabel AddWPattern1 = new JLabel();
			        AddWPattern1.setBounds(103, 446, 350,80);
			        AddWPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel AddWPattern2 = new JLabel();
			        AddWPattern2.setBounds(460, 446, 350,80);
			        AddWPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel AddWPattern3 = new JLabel();
			        AddWPattern3.setBounds(187, 5, 152,47);
			        AddWPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel AddWPattern4 = new JLabel();
			        AddWPattern4.setBounds(484, 5, 152,47);
			        AddWPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
  			        
  			        MenuAddWS.addActionListener(new ActionListener() {

  						@Override
  						public void actionPerformed(ActionEvent e) {
  							FAddWS.dispose();
  							
  						}
  			        	
  			        });
  			        
  			        
  			     JButton BAddW = new RoundedButton("Add", new Color(42,115,141), 20);
  			     BAddW.setBounds(490, 264, 65, 30);
  			     BAddW.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
  			     BAddW.setForeground(Color.WHITE);
  			     
  			      JLabel Checking3 = new JLabel();
			      Checking3.setBounds(490, 299, 250, 20);
			      Checking3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
			      Checking3.setForeground(Color.BLACK);
			      
			     
  			   
			      BAddW.addActionListener(new ActionListener() {
			    	    @Override
			    	    public void actionPerformed(ActionEvent e) {
			    	        try {
			    	            String selectedSpec = (String) SpecWC.getSelectedItem();
			    	            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
			    	            String formattedDate = dateFormat.format(DateW.getDate());

			    	            String gender = MaleW.isSelected() ? "Male" : "Female";
			    	            final int ID[] = {0};

			    	            if ("Chief Physician".equals(selectedSpec) || "Doctor".equals(selectedSpec) || "Dentist".equals(selectedSpec)) {
			    	                if (!NameWT.getText().isEmpty() && !SurWT.getText().isEmpty() && (MaleW.isSelected() || FemaleW.isSelected()) &&
			    	                        !SpecWL.getText().isEmpty() && !ExpWT.getText().isEmpty() && !PriceWT.getText().isEmpty() && !SalaryWT.getText().isEmpty()) {
			    	                    
			    	                    if ("Chief Physician".equals(selectedSpec)) {
			    	                        Wmodel1.addRow(new Object[]{ID[0], NameWT.getText(), SurWT.getText(), gender,
			    	                                selectedSpec, ExpWT.getText(), formattedDate, "$" + PriceWT.getText() + ".0", "$" + SalaryWT.getText() + ".0"});
			    	                        
			    	                    } else if ("Doctor".equals(selectedSpec)) {
			    	                        DocModel1.addRow(new Object[]{ID[0], NameWT.getText(), SurWT.getText(), gender,
			    	                                selectedSpec, ExpWT.getText(), formattedDate, "$" + PriceWT.getText() + ".0", "$" + SalaryWT.getText() + ".0"});
			    	                        
			    	                    } else if ("Dentist".equals(selectedSpec)) {
			    	                        DenModel1.addRow(new Object[]{ID[0], NameWT.getText(), SurWT.getText(), gender,
			    	                                selectedSpec, ExpWT.getText(), formattedDate, "$" + PriceWT.getText() + ".0", "$" + SalaryWT.getText() + ".0"});
			    	                    }
			    	                    
			    	                    Checking3.setText("Worker was added successfully");
			    	                    Checking3.setForeground(new Color(56, 87, 35));
			    	                    JOptionPane.showMessageDialog(null, "Worker was added successfully", null, JOptionPane.INFORMATION_MESSAGE);
			    	                    
			    	                } else {
			    	                    
			    	                    throw new IllegalArgumentException("Please fill out all fields");
			    	                }
			    	            } else if ("Nurse".equals(selectedSpec)) {
			    	                if (!NameWT.getText().isEmpty() && !SurWT.getText().isEmpty() && (MaleW.isSelected() || FemaleW.isSelected()) &&
			    	                        !ExpWT.getText().isEmpty() && !SalaryWT.getText().isEmpty()) {
			    	                    
			    	                    NursModel1.addRow(new Object[]{ID[0], NameWT.getText(), SurWT.getText(), gender,
			    	                            ExpWT.getText(), formattedDate, "$" + SalaryWT.getText() + ".0"});
			    	                    
			    	                    Checking3.setText("Worker was added successfully");
			    	                    Checking3.setForeground(new Color(56, 87, 35));
			    	                    JOptionPane.showMessageDialog(null, "Worker was added successfully", null, JOptionPane.INFORMATION_MESSAGE);
			    	                    
			    	                } else {
			    	                    
			    	                    throw new IllegalArgumentException("Please fill out all fields");
			    	                }
			    	            } else if ("Receptionist".equals(selectedSpec) || "Security".equals(selectedSpec) || "Housekeeper".equals(selectedSpec)) {
			    	                if (!NameWT.getText().isEmpty() && !SurWT.getText().isEmpty() && (MaleW.isSelected() || FemaleW.isSelected()) &&
			    	                        !SalaryWT.getText().isEmpty()) {
			    	                    
			    	                    if ("Receptionist".equals(selectedSpec)) {
			    	                        RecModel1.addRow(new Object[]{ID[0], NameWT.getText(), SurWT.getText(), gender,
			    	                                formattedDate, "$" + SalaryWT.getText() + ".0"});
			    	                        
			    	                    } else if ("Security".equals(selectedSpec)) {
			    	                        SecModel1.addRow(new Object[]{ID[0], NameWT.getText(), SurWT.getText(), gender,
			    	                                formattedDate, "$" + SalaryWT.getText() + ".0"});
			    	                        
			    	                    } else if ("Housekeeper".equals(selectedSpec)) {
			    	                        HouseModel1.addRow(new Object[]{ID[0], NameWT.getText(), SurWT.getText(), gender,
			    	                                formattedDate, "$" + SalaryWT.getText() + ".0"});
			    	                    }
			    	                    
			    	                    Checking3.setText("Worker was added successfully");
			    	                    Checking3.setForeground(new Color(56, 87, 35));
			    	                    JOptionPane.showMessageDialog(null, "Worker was added successfully", null, JOptionPane.INFORMATION_MESSAGE);
			    	                    
			    	                } else {
			    	                    
			    	                    throw new IllegalArgumentException("Please fill out all fields");
			    	                }
			    	            } else {
			    	                
			    	                throw new IllegalArgumentException("Invalid specialization selected");
			    	            }
			    	        } catch (NullPointerException ex) {
			    	            JOptionPane.showMessageDialog(null, "Please select a date", null, JOptionPane.WARNING_MESSAGE);
			    	            Checking3.setText("Please select a date");
			    	            Checking3.setForeground(Color.red);
			    	        } catch (IllegalArgumentException ex) {
			    	            JOptionPane.showMessageDialog(null, ex.getMessage(), null, JOptionPane.WARNING_MESSAGE);
			    	            Checking3.setText(ex.getMessage());
			    	            Checking3.setForeground(Color.red);
			    	        }
			    	    }
			    	});
			      
			      SpecWC.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							 String selectedSpec = (String) SpecWC.getSelectedItem();
							
							 if (("Nurse").equals(selectedSpec)) {
				                	
								    PriceWT.setEnabled(false);
								    FemaleW.setSelected(true);
				                	
							 }else if(("Receptionist").equals(selectedSpec)) {
								    
								    PriceWT.setEnabled(false);
				                	ExpWT.setEnabled(false);
				                	
							 }else if(("Security").equals(selectedSpec)) {
								    
								    PriceWT.setEnabled(false);
				                	ExpWT.setEnabled(false);
				                	
							 }else if(("Housekeeper").equals(selectedSpec)) {
								    
								    PriceWT.setEnabled(false);
				                	ExpWT.setEnabled(false);
							 }
							 else if(("Chief Physician").equals(selectedSpec)) {
								    
								    PriceWT.setEnabled(true);
				                	ExpWT.setEnabled(true);
				                	
							 }else if(("Doctor").equals(selectedSpec)) {
								    
								    PriceWT.setEnabled(true);
				                	ExpWT.setEnabled(true);
				                	
							 }else if(("Dentist").equals(selectedSpec)) {
								    
								    PriceWT.setEnabled(true);
				                	ExpWT.setEnabled(true);
							 }
						}
		  				 
		  			 });

  			 
  			      FAddWS.setLayout(null);
  			      FAddWS.add(MenuAddWS);
  			      FAddWS.add(AddWPattern1);
  			      FAddWS.add(AddWPattern2);
  			      FAddWS.add(AddWPattern3);
  			      FAddWS.add(AddWPattern4);
  			      FAddWS.add(LAddWS);
  			      FAddWS.add(NameWL);
			      FAddWS.add(NameWT);
			      FAddWS.add(SurWL);
			      FAddWS.add(SurWT);
			      FAddWS.add(GenderWL);
			      FAddWS.add(MaleW);
			      FAddWS.add(FemaleW);
			      FAddWS.add(SpecWL);
			      FAddWS.add(SpecWC);
			      FAddWS.add(ExpWL);
			      FAddWS.add(ExpWT);
			      FAddWS.add(PriceWL);
			      FAddWS.add(PriceWT);
			      FAddWS.add(DateWL);
			      FAddWS.add(DateW);
			      FAddWS.add(BAddW);
			      FAddWS.add(SalaryWL);
			      FAddWS.add(SalaryWT);
			      FAddWS.add(DollarWL);
			      FAddWS.add(Dollar);
			      FAddWS.add(Checking3);
  			}
  	    	
  	    }); 
	    
	    
	    //Create Appointment
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    BCreateAppointment.addActionListener(new ActionListener() {

  			@Override
  			public void actionPerformed(ActionEvent e) {
  				
  				JFrame FCreateAp = new JFrame();
  				FCreateAp.setBounds(0, 0, 830, 572);
  				FCreateAp.getContentPane().setBackground(new Color(242,242,242));
  				FCreateAp.setLocationRelativeTo(FCreateAp);
  				FCreateAp.setVisible(true);
  				FCreateAp.setResizable(false);
  				
  				
  				JLabel NameCreateL = new JLabel("Name:");
  				NameCreateL.setBounds(110, 90, 60, 20);
  				NameCreateL.setFont(new Font("Calibri", Font.PLAIN, 19));
  				
  				JTextArea NameCreateT = new JTextArea();
  				NameCreateT.setBounds(107, 111, 166, 21);
  				NameCreateT.setBorder(border);
  				
  				JLabel SurNameCreateL = new JLabel("Surname:");
  				SurNameCreateL.setBounds(110, 149, 90, 20);
  				SurNameCreateL.setFont(new Font("Calibri", Font.PLAIN, 19));
  				
  				JTextArea SurCreateT = new JTextArea();
  				SurCreateT.setBounds(107, 170, 166, 21);
  				SurCreateT.setBorder(border);
  				
  				JLabel CreateGenL = new JLabel("Gender:");
  				CreateGenL.setBounds(110, 208, 90, 20);
  				CreateGenL.setFont(new Font("Calibri", Font.PLAIN, 19));
  				
  				JRadioButton MaleCreate = new JRadioButton("Male");
  				MaleCreate.setBounds(117, 233, 70, 20);
  				MaleCreate.setFont(new Font("Calibri", Font.PLAIN, 18));
  				MaleCreate.setBackground(new Color(242,242,242));
  				
  				JRadioButton FemaleCreate = new JRadioButton("Female");
  				FemaleCreate.setBounds(190, 233, 90, 20);
  				FemaleCreate.setFont(new Font("Calibri", Font.PLAIN, 18));
  				FemaleCreate.setBackground(new Color(242,242,242));
  				
  				ButtonGroup bgCreate = new ButtonGroup();
  				bgCreate.add(MaleCreate);
  				bgCreate.add(FemaleCreate);
  				
  				JLabel CreateDocName = new JLabel("Doctor Name:");
  				CreateDocName.setBounds(110, 273, 130, 20);
  				CreateDocName.setFont(new Font("Calibri", Font.PLAIN, 19));
  				
  				JTextArea CreateDocNameT = new JTextArea();
  				CreateDocNameT.setBounds(107, 294, 166, 22);
  				CreateDocNameT.setBorder(border);
  		        
  		        JLabel DateCreateL = new JLabel("Date of Appointment:");
  		        DateCreateL.setBounds(110, 331, 170, 20);
  		        DateCreateL.setFont(new Font("Calibri", Font.PLAIN, 19));
  		        
  		        JDateChooser DateCreate = new JDateChooser();
  		        DateCreate.setBounds(107, 352, 166, 23);
  		        
  		        JLabel NumberCreateL = new JLabel("Number:");
  		        NumberCreateL.setBounds(490, 90, 90, 20);
  		        NumberCreateL.setFont(new Font("Calibri", Font.PLAIN, 19));
				
				JTextArea NumberCreateT = new JTextArea();
				NumberCreateT.setBounds(487, 111, 166, 21);
				NumberCreateT.setBorder(border);
				
				JLabel EmailCreateL = new JLabel("E-mail:");
				EmailCreateL.setBounds(490, 149, 90, 20);
				EmailCreateL.setFont(new Font("Calibri", Font.PLAIN, 19));
				
				JTextArea EmailCreateT = new JTextArea();
				EmailCreateT.setBounds(487, 170, 166, 21);
				EmailCreateT.setBorder(border);
  				
  			        
  			        JButton MenuCreateAp = new RoundedButton("Menu",new Color(51,111,178), 18);
  			        MenuCreateAp.setBounds(360, 463, 93, 46);
  			        MenuCreateAp.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
  			        MenuCreateAp.setForeground(Color.WHITE);
  			        
  			        JLabel LCreateAp = new JLabel("Create Appointment");
  			        LCreateAp.setBounds(295, 8, 240, 35);
  			        LCreateAp.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
  			        LCreateAp.setForeground(Color.BLACK);
			        
			        JLabel CreateApPattern1 = new JLabel();
			        CreateApPattern1.setBounds(103, 446, 350,80);
			        CreateApPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel CreateApPattern2 = new JLabel();
			        CreateApPattern2.setBounds(460, 446, 350,80);
			        CreateApPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel CreateApPattern3 = new JLabel();
			        CreateApPattern3.setBounds(135, 5, 152,47);
			        CreateApPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel CreateApPattern4 = new JLabel();
			        CreateApPattern4.setBounds(524, 5, 152,47);
			        CreateApPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
  			        
  			        MenuCreateAp.addActionListener(new ActionListener() {

  						@Override
  						public void actionPerformed(ActionEvent e) {
  							FCreateAp.dispose();
  							
  						}
  			        	
  			        });
  			        
  			        
  			      JButton BCreate = new RoundedButton("Create", new Color(42,115,141), 17);
  			      BCreate.setBounds(490, 210, 90, 30);
  			      BCreate.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
  			      BCreate.setForeground(Color.WHITE);
  			      
  			      JLabel Checking = new JLabel();
  			      Checking.setBounds(490, 245, 200, 20);
  			      Checking.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
  			      Checking.setForeground(Color.BLACK);
  			   
  			      
  			      BCreate.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						try {
						
						 SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
			  		        String formattedDate = dateFormat.format(DateCreate.getDate());
			  		        
			  		      final int ID[] = {0};
							
							if(!NameCreateT.getText().isEmpty() && !SurCreateT.getText().isEmpty() && (MaleCreate.isSelected() || FemaleCreate.isSelected()) && !CreateDocNameT.getText().isEmpty()
									  && !NumberCreateT.getText().isEmpty() && !EmailCreateT.getText().isEmpty()) {
					        	
					        	ID[0]++;
								
								
					        	Amodel1.addRow(new Object[] {ID[0],NameCreateT.getText(),SurCreateT.getText(),
					        			MaleCreate.isSelected() ? "Male" : "Female",NumberCreateT.getText(),EmailCreateT.getText(),
										formattedDate,CreateDocNameT.getText()});
					        	
					        	for(int i=0; i<Amodel1.getRowCount();i++) {
					        		Amodel1.setValueAt(i+1, i ,0);
					            }
							    ID[0]= Amodel1.getRowCount();
							    
					        	Checking.setText("Appointment was created");
					        	Checking.setForeground(Color.green);
					        	Checking.setForeground(new Color(56,87,35));
					        }
							
							else {
							
					        	JOptionPane.showMessageDialog(null, "Fill out all the fields", null ,JOptionPane.WARNING_MESSAGE);
					        	Checking.setText("Please fill out all the fields");
					        	Checking.setForeground(Color.red);
					        	
					        }
							

						}catch(NullPointerException ex)
						{JOptionPane.showMessageDialog(null, "Please select a date", null ,JOptionPane.WARNING_MESSAGE);
						Checking.setText("Please select a date");
			        	Checking.setForeground(Color.red);
			        	}

						}
  			    	  
  			      });
  			        
  			      FCreateAp.setLayout(null);
  			      FCreateAp.add(MenuCreateAp);
  			      FCreateAp.add(CreateApPattern1);
  			      FCreateAp.add(CreateApPattern2);
  			      FCreateAp.add(CreateApPattern3);
  			      FCreateAp.add(CreateApPattern4);
  			      FCreateAp.add(LCreateAp);
  			      FCreateAp.add(NameCreateL);
			      FCreateAp.add(NameCreateT);
			      FCreateAp.add(SurNameCreateL);
			      FCreateAp.add(SurCreateT);
			      FCreateAp.add(CreateGenL);
			      FCreateAp.add(MaleCreate);
			      FCreateAp.add(FemaleCreate);
			      FCreateAp.add(CreateDocName);
			      FCreateAp.add(CreateDocNameT);
			      FCreateAp.add(NumberCreateL);
			      FCreateAp.add(NumberCreateT);
			      FCreateAp.add(EmailCreateL);
			      FCreateAp.add(EmailCreateT);
			      FCreateAp.add(DateCreateL);
			      FCreateAp.add(DateCreate);
			      FCreateAp.add(BCreate);
			      FCreateAp.add(Checking);
  			}
  	    	
  	    });
	    
	    
	  //Registration Patients
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    BRegisP.addActionListener(new ActionListener() {

  			@Override
  			public void actionPerformed(ActionEvent e) {
  				
  				JFrame FRegisP = new JFrame();
  				FRegisP.setBounds(0, 0, 830, 572);
  				FRegisP.getContentPane().setBackground(new Color(242,242,242));
  				FRegisP.setLocationRelativeTo(FRegisP);
  				FRegisP.setVisible(true);
  				FRegisP.setResizable(false);
  				
  				
  				JLabel NameRegisPL = new JLabel("Name:");
  				NameRegisPL.setBounds(110, 90, 60, 20);
  				NameRegisPL.setFont(new Font("Calibri", Font.PLAIN, 19));
  				
  				JTextArea NameRegisPT = new JTextArea();
  				NameRegisPT.setBounds(107, 111, 166, 21);
  				NameRegisPT.setBorder(border);
  				
  				JLabel SurRegisPL = new JLabel("Surname:");
  				SurRegisPL.setBounds(110, 149, 90, 20);
  				SurRegisPL.setFont(new Font("Calibri", Font.PLAIN, 19));
  				
  				JTextArea SurRegisPT = new JTextArea();
  				SurRegisPT.setBounds(107, 170, 166, 21);
  				SurRegisPT.setBorder(border);
  				
  				JLabel GenderRegisPL = new JLabel("Gender:");
  				GenderRegisPL.setBounds(110, 208, 90, 20);
  				GenderRegisPL.setFont(new Font("Calibri", Font.PLAIN, 19));
  				
  				JRadioButton MaleRegisP = new JRadioButton("Male");
  				MaleRegisP.setBounds(117, 233, 70, 20);
  				MaleRegisP.setFont(new Font("Calibri", Font.PLAIN, 18));
  				MaleRegisP.setBackground(new Color(242,242,242));
  				
  				JRadioButton FemaleRegisP = new JRadioButton("Female");
  				FemaleRegisP.setBounds(190, 233, 90, 20);
  				FemaleRegisP.setFont(new Font("Calibri", Font.PLAIN, 18));
  				FemaleRegisP.setBackground(new Color(242,242,242));
  				
  				ButtonGroup bgRegisP = new ButtonGroup();
  				bgRegisP.add(MaleRegisP);
  				bgRegisP.add(FemaleRegisP);
  				
  				JLabel TypeRegisPL = new JLabel("Type of Disease:");
  				TypeRegisPL.setBounds(110, 273, 180, 20);
  				TypeRegisPL.setFont(new Font("Calibri", Font.PLAIN, 19));
  				
  				String[] Diseases = {"Bed Patient","Infectious Patient","Chronic Patient","Genetic Patient","Cancer Patient",
  						"Respiratory Patient","Endocrine Patient","Neurological Patient","Skin Patient","Mental Patient"};
  				
  				String[] Services = {"Laboratory","Urology","Dentistry","Pediatrics","Therapy","Reanimation","Ambulance","General Surgery"};
  				
  				JComboBox<String> DiseasesC = new JComboBox<>(Diseases);
  				DiseasesC.setBounds(107, 294, 169, 22);
  				Font largerFont = DiseasesC.getFont().deriveFont(Font.BOLD, 14); 
  				DiseasesC.setFont(largerFont);
  		        
  		        JLabel ServiceRegisPL = new JLabel("Service Type:");
  		        ServiceRegisPL.setBounds(110, 331, 130, 20);
  		        ServiceRegisPL.setFont(new Font("Calibri", Font.PLAIN, 19));
  		        
  		        JComboBox<String> ServicesC = new JComboBox<>(Services);
  		        ServicesC.setBounds(107, 352, 166, 23);
  		        Font ServicesCFont = ServicesC.getFont().deriveFont(Font.BOLD, 14); 
  		        ServicesC.setFont(ServicesCFont);
  		        
  		        JLabel DateRegistrPL = new JLabel("Date of Registration:");
  		        DateRegistrPL.setBounds(490, 90, 170, 20);
  		        DateRegistrPL.setFont(new Font("Calibri", Font.PLAIN, 19));
				
				JDateChooser DateRegistrP = new JDateChooser();
				DateRegistrP.setBounds(487, 111, 166, 21);
				
				JLabel NumberRegisPL = new JLabel("Number:");
				NumberRegisPL.setBounds(490, 149, 90, 20);
				NumberRegisPL.setFont(new Font("Calibri", Font.PLAIN, 19));
				
				JTextArea NumberRegisPT = new JTextArea();
				NumberRegisPT.setBounds(487, 170, 166, 21);
				NumberRegisPT.setBorder(border);
				
				JLabel EmailRegisPL = new JLabel("E-mail:");
				EmailRegisPL.setBounds(490, 208, 90, 20);
				EmailRegisPL.setFont(new Font("Calibri", Font.PLAIN, 19));
				
				JTextArea EmailRegisPT = new JTextArea();
				EmailRegisPT.setBounds(487, 229, 166, 21);
				EmailRegisPT.setBorder(border);
  				
  			        
  			        JButton MenuRegisP = new RoundedButton("Menu",new Color(51,111,178), 18);
  			        MenuRegisP.setBounds(360, 463, 93, 46);
  			        MenuRegisP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
  			        MenuRegisP.setForeground(Color.WHITE);
  			        
  			        JLabel LRegisP = new JLabel("Registration Patients");
  			        LRegisP.setBounds(295, 8, 240, 35);
  			        LRegisP.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
  			        LRegisP.setForeground(Color.BLACK);
			        
			        JLabel RegisPPattern1 = new JLabel();
			        RegisPPattern1.setBounds(101, 446, 350,80);
			        RegisPPattern1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p.png"));
			        
			        JLabel RegisPPattern2 = new JLabel();
			        RegisPPattern2.setBounds(460, 446, 350,80);
			        RegisPPattern2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p2.png"));
			        
			        JLabel RegisPPattern3 = new JLabel();
			        RegisPPattern3.setBounds(133, 5, 152,47);
			        RegisPPattern3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p3.png"));
			        
			        JLabel RegisPPattern4 = new JLabel();
			        RegisPPattern4.setBounds(530, 5, 152,47);
			        RegisPPattern4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hospital\\p4.png"));
  			        
  			        MenuRegisP.addActionListener(new ActionListener() {

  						@Override
  						public void actionPerformed(ActionEvent e) {
  							FRegisP.dispose();
  							
  						}
  			        	
  			        });
  			        
  			        
  			      JButton BRegister = new RoundedButton("Register", new Color(42,115,141), 17);
  			      BRegister.setBounds(490, 308, 105, 30);
  			      BRegister.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
  			      BRegister.setForeground(Color.WHITE);
  			      
  			      JLabel checking2 = new JLabel();
  			      checking2.setBounds(490, 343, 200, 20);
  			      checking2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
  			      checking2.setForeground(Color.BLACK);
  			      
  			      JLabel servicefee = new JLabel("Service fee: 70 $");
  			      servicefee.setBounds(490, 268, 200, 20);
  			      servicefee.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
  			      servicefee.setForeground(new Color(56,87,35));
  			      
  			      
  			    ServicesC.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String SelectedService = (String) ServicesC.getSelectedItem();
						
						if("Laboratory".equals(SelectedService)) {
							servicefee.setText("Service fee: 70 $");
						}else if("Reanimation".equals(SelectedService)) {
							servicefee.setText("Service fee: 270 $");
						}else if("Urology".equals(SelectedService)) {
							servicefee.setText("Service fee: 190 $");
						}else if("Ambulance".equals(SelectedService)) {
							servicefee.setText("Service fee: 155 $");
						}else if("General Surgery".equals(SelectedService)) {
							servicefee.setText("Service fee: 235 $");
						}else if("Dentistry".equals(SelectedService)) {
							servicefee.setText("Service fee: 315 $");
						}else if("Pediatrics".equals(SelectedService)) {
							servicefee.setText("Service fee: 260 $");
						}else if("Therapy".equals(SelectedService)) {
							servicefee.setText("Service fee: 280 $");
						}
						
					}
  			    	
  			    });
  			      
			      
  			    BRegister.addActionListener(new ActionListener() {
  			      @Override
  			      public void actionPerformed(ActionEvent e) {
  			          try {
  			              if (!NameRegisPT.getText().isEmpty() && !SurRegisPT.getText().isEmpty() && (MaleRegisP.isSelected() || FemaleRegisP.isSelected()) && !NumberRegisPT.getText().isEmpty() && !EmailRegisPT.getText().isEmpty()) {
  			                  String selectedDissease = (String) DiseasesC.getSelectedItem();
  			                  SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
  			                  String formattedDate = dateFormat.format(DateRegistrP.getDate());
  			                  final int ID[] = {0};

  			                  if (("Bed Patient").equals(selectedDissease)) {
  			                      BedPModel1.addRow(new Object[]{ID[0], NameRegisPT.getText(), SurRegisPT.getText(), MaleRegisP.isSelected() ? "Female" : "Male", 
  			                    		  DiseasesC.getSelectedItem(), formattedDate, NumberRegisPT.getText(), EmailRegisPT.getText()});
  			                      
  			                  } else if (("Infectious Patient").equals(selectedDissease)) {
  			                      InfectPModel1.addRow(new Object[]{ID[0], NameRegisPT.getText(), SurRegisPT.getText(), MaleRegisP.isSelected() ? "Female" : "Male", 
  			                    		  DiseasesC.getSelectedItem(), formattedDate, NumberRegisPT.getText(), EmailRegisPT.getText()});
  			                      
  			                  } else if (("Chronic Patient").equals(selectedDissease)) {
  			                      ChronicPModel1.addRow(new Object[]{ID[0], NameRegisPT.getText(), SurRegisPT.getText(), MaleRegisP.isSelected() ? "Female" : "Male", 
  			                    		  DiseasesC.getSelectedItem(), formattedDate, NumberRegisPT.getText(), EmailRegisPT.getText()});
  			                      
  			                  } else if (("Genetic Patient").equals(selectedDissease)) {
  			                      GeneticPModel1.addRow(new Object[]{ID[0], NameRegisPT.getText(), SurRegisPT.getText(), MaleRegisP.isSelected() ? "Female" : "Male", 
  			                    		  DiseasesC.getSelectedItem(), formattedDate, NumberRegisPT.getText(), EmailRegisPT.getText()});
  			                      
  			                  } else if (("Cancer Patient").equals(selectedDissease)) {
  			                      CancerPModel1.addRow(new Object[]{ID[0], NameRegisPT.getText(), SurRegisPT.getText(), MaleRegisP.isSelected() ? "Female" : "Male", 
  			                    		  DiseasesC.getSelectedItem(), formattedDate, NumberRegisPT.getText(), EmailRegisPT.getText()});
  			                      
  			                  } else if (("Respiratory Patient").equals(selectedDissease)) {
  			                      RespiratoryPModel1.addRow(new Object[]{ID[0], NameRegisPT.getText(), SurRegisPT.getText(), MaleRegisP.isSelected() ? "Female" : "Male", 
  			                    		  DiseasesC.getSelectedItem(), formattedDate, NumberRegisPT.getText(), EmailRegisPT.getText()});
  			                      
  			                  } else if (("Endocrine Patient").equals(selectedDissease)) {
  			                	       EndocPModel1.addRow(new Object[]{ID[0], NameRegisPT.getText(), SurRegisPT.getText(), MaleRegisP.isSelected() ? "Female" : "Male", 
  			                    		  DiseasesC.getSelectedItem(), formattedDate, NumberRegisPT.getText(), EmailRegisPT.getText()});
  			                      
  			                  } else if (("Neurological Patient").equals(selectedDissease)) {
  			                      NeuroPModel1.addRow(new Object[]{ID[0], NameRegisPT.getText(), SurRegisPT.getText(), MaleRegisP.isSelected() ? "Female" : "Male", 
  			                    		  DiseasesC.getSelectedItem(), formattedDate, NumberRegisPT.getText(), EmailRegisPT.getText()});
  			                      
  			                  } else if (("Skin Patient").equals(selectedDissease)) {
  			                      SkinPModel1.addRow(new Object[]{ID[0], NameRegisPT.getText(), SurRegisPT.getText(), MaleRegisP.isSelected() ? "Female" : "Male", 
  			                    		  DiseasesC.getSelectedItem(), formattedDate, NumberRegisPT.getText(), EmailRegisPT.getText()});
  			                      
  			                  } else if (("Mental Patient").equals(selectedDissease)) {
  			                      MentalPModel1.addRow(new Object[]{ID[0], NameRegisPT.getText(), SurRegisPT.getText(), MaleRegisP.isSelected() ? "Female" : "Male", 
  			                    		  DiseasesC.getSelectedItem(), formattedDate, NumberRegisPT.getText(), EmailRegisPT.getText()});
  			                  }
  			                  
  			                  checking2.setText("Patient was registered");
		                      checking2.setForeground(new Color(56,87,35));
  			                  
  			              } else {
  			                  JOptionPane.showMessageDialog(null, "Please fill out all fields", null, JOptionPane.WARNING_MESSAGE);
  			                  checking2.setText("Fill out all the fields");
  			                  checking2.setForeground(Color.red);
  			              }
  			          } catch (NullPointerException ex) {
  			              JOptionPane.showMessageDialog(null, "Please select a date", null, JOptionPane.WARNING_MESSAGE);
  			              checking2.setText("Please select a date");
  			              checking2.setForeground(Color.red);
  			          }
  			      }
  			  });

  			        
  			      FRegisP.setLayout(null);
  			      FRegisP.add(MenuRegisP);
  			      FRegisP.add(RegisPPattern1);
  			      FRegisP.add(RegisPPattern2);
  			      FRegisP.add(RegisPPattern3);
  			      FRegisP.add(RegisPPattern4);
  			      FRegisP.add(LRegisP);
  			      FRegisP.add(NameRegisPL);
			      FRegisP.add(NameRegisPT);
			      FRegisP.add(SurRegisPL);
			      FRegisP.add(SurRegisPT);
			      FRegisP.add(GenderRegisPL);
			      FRegisP.add(MaleRegisP);
			      FRegisP.add(FemaleRegisP);
			      FRegisP.add(TypeRegisPL);
			      FRegisP.add(DiseasesC);
			      FRegisP.add(NumberRegisPL);
			      FRegisP.add(NumberRegisPT);
			      FRegisP.add(EmailRegisPL);
			      FRegisP.add(EmailRegisPT);
			      FRegisP.add(ServiceRegisPL);
			      FRegisP.add(DateRegistrP);
			      FRegisP.add(DateRegistrPL);
			      FRegisP.add(ServicesC);
			      FRegisP.add(BRegister);
			      FRegisP.add(checking2);
			      FRegisP.add(servicefee);
  			}
  	    	
  	    }); 
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------   
		Blogin.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		       
		        String username = Tname.getText();
		        char[] passwordChars = Tpassword.getPassword();
		        String enteredPassword = new String(passwordChars);

		        if (username.isEmpty() || enteredPassword.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please enter both Username and Password", "Warning", JOptionPane.WARNING_MESSAGE);
		        } else if (!username.equals("Elcin") || !enteredPassword.equals("455555-")) {
		            JOptionPane.showMessageDialog(null, "Your Username or Password is incorrect", "Warning", JOptionPane.WARNING_MESSAGE);
		        }else {
		        	JOptionPane.showMessageDialog(null, "   You entered successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
		        	
		        	menu.setVisible(true);
		        	dispose();
		        }
		        
		    }
		});
		
		Breset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Tname.setText("");
				Tpassword.setText("");
				
			}
			
		});

	}
	
	
	
	public class RoundedButton extends JButton {

	    private Color backgroundColor;
	    private int cornerRadius;

	    public RoundedButton(String text, Color backgroundColor, int cornerRadius) {
	        super(text);
	        this.backgroundColor = backgroundColor;
	        this.cornerRadius = cornerRadius;
	        setOpaque(false);
	        setContentAreaFilled(false);
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        Graphics2D g2d = (Graphics2D) g.create();
	        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	        int width = getWidth();
	        int height = getHeight();

	        // Paint the background
	        g2d.setColor(backgroundColor);
	        g2d.fill(new RoundRectangle2D.Double(0, 0, width, height, cornerRadius, cornerRadius));

	        // Paint the text
	        super.paintComponent(g2d);

	        g2d.dispose();
	    }

	    @Override
	    protected void paintBorder(Graphics g) {
	        // No border painting
	    }

	    @Override
	    public Dimension getPreferredSize() {
	        return new Dimension(150, 50); // Set preferred size
	    }
	}
	
	
	
	
	 class RoundedBorder extends LineBorder {
	        private int radius;

	        public RoundedBorder(int radius) {
	            super(null, 0);
	            this.radius = radius;
	        }

	        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	            super.paintBorder(c, g, x, y, width, height);
	            Graphics2D g2d = (Graphics2D) g;
	            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	            g2d.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
	        }
	}
	
	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
}


