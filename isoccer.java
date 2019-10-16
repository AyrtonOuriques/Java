import java.util.Scanner;
public class senha
{
	public static String[][] funcionarios= new String[10000][8];
	public static String[][] socios= new String[10000][9];
	public static String[][] recursos= new String[10000][5];
	public static int i=0;
	public static int i2=0;
	public static int i3=0;
	public static void relatorios(int sagrado)
	{
		Scanner obj=new Scanner(System.in);
		String ent="";
		String ent2="";
		if(sagrado==-1)
		{
			System.out.print("\nSelecione relatorio:\n\n");
  			System.out.print("\n1-Funcionarios\n\n2-Socios\n\n3-Recursos fisicos\n\n4-Todos\n\n");
  			ent=obj.nextLine();
		}
		if(sagrado==1)
		{
			ent="1";
		}
  		if(ent.equalsIgnoreCase("sair"))
  		{
  			System.exit(0);
  		}
  		if(ent.equals("1"))
  		{
  			if(sagrado==-1)
  			{
  				System.out.print("\n1-Time\n\n2-Servicos gerais\n\n");
  				ent2=obj.nextLine();
  			}
  			if(sagrado==1)
			{
				ent2="1";
			}
  			if(ent2.equalsIgnoreCase("sair"))
  			{
  				System.exit(0);
  			}
  			if(ent2.equals("1"))
  			{
  				System.out.print("\nTecnico(s):\n\n");
  				for(int aux=0;aux<i;aux++)
  				{
  					if (funcionarios[aux][0].equals("3"))
  					{
  						System.out.print("\n-Tecnico " + funcionarios[aux][1] + "\n\n");
  						System.out.print("\n-Email " + funcionarios[aux][2] + "\n\n");
  						System.out.print("\n-CPF " + funcionarios[aux][3] + "\n\n");
  						System.out.print("\n-Salario " + funcionarios[aux][4] + "\n\n");
  						System.out.print("\n-Telefone " + funcionarios[aux][5] + "\n\n");
  					}
  				}
  				System.out.print("\nJogador(s):\n\n");
  				for(int aux=0;aux<i;aux++)
  				{
  					if (funcionarios[aux][0].equals("8"))
  					{
  						System.out.print("\n-Jogador " + funcionarios[aux][1] + "\n\n");
  						System.out.print("\n-Email " + funcionarios[aux][2] + "\n\n");
  						System.out.print("\n-CPF " + funcionarios[aux][3] + "\n\n");
  						System.out.print("\n-Salario " + funcionarios[aux][4] + "\n\n");
  						System.out.print("\n-Telefone " + funcionarios[aux][5] + "\n\n");
  						System.out.print("\n-Tipo de jogador " + funcionarios[aux][6] + "\n\n");
  						System.out.print("\n-Aptidao " + funcionarios[aux][7] + "\n\n");
  					}
  				}
  				System.out.print("\nDeseja saber todos jogadores aptos?\n\n");
  				ent=obj.nextLine();
  				if("sim".equalsIgnoreCase(ent))
  				{
  					for(int aux=0;aux<i;aux++)
  					{
  						if ("apto".equalsIgnoreCase(funcionarios[aux][7]))
  						{
  							System.out.print("\n-Jogador " + funcionarios[aux][1] + "\n\n");
  						}
  					}
  				}
  				if(sagrado==1)
				{
					ent2="2";
				}
  			}
  			if(ent2.equals("2"))
  			{
  				System.out.print("\nPresidente(s):\n\n");
  				for(int aux=0;aux<i;aux++)
  				{
  					if (funcionarios[aux][0].equals("1"))
  					{
  						System.out.print("\n-Presidente " + funcionarios[aux][1] + "\n\n");
  						System.out.print("\n-Email " + funcionarios[aux][2] + "\n\n");
  						System.out.print("\n-CPF " + funcionarios[aux][3] + "\n\n");
  						System.out.print("\n-Salario " + funcionarios[aux][4] + "\n\n");
  						System.out.print("\n-Telefone " + funcionarios[aux][5] + "\n\n");
  					}
  				}
  				System.out.print("\nMedico(s):\n\n");
  				for(int aux=0;aux<i;aux++)
  				{
  					if (funcionarios[aux][0].equals("2"))
  					{
  						System.out.print("\n-Medico " + funcionarios[aux][1] + "\n\n");
  						System.out.print("\n-Email " + funcionarios[aux][2] + "\n\n");
  						System.out.print("\n-CPF " + funcionarios[aux][3] + "\n\n");
  						System.out.print("\n-Salario " + funcionarios[aux][4] + "\n\n");
  						System.out.print("\n-Telefone " + funcionarios[aux][5] + "\n\n");
  						System.out.print("\n-CRM " + funcionarios[aux][6] + "\n\n");
  					}
  				}
  				System.out.print("\nPreparadores fisicos:\n\n");
  				for(int aux=0;aux<i;aux++)
  				{
  					if (funcionarios[aux][0].equals("4"))
  					{
  						System.out.print("\n-Preparador fisico " + funcionarios[aux][1] + "\n\n");
  						System.out.print("\n-Email " + funcionarios[aux][2] + "\n\n");
  						System.out.print("\n-CPF " + funcionarios[aux][3] + "\n\n");
  						System.out.print("\n-Salario " + funcionarios[aux][4] + "\n\n");
  						System.out.print("\n-Telefone " + funcionarios[aux][5] + "\n\n");
  					}
  				}
  				System.out.print("\nMotorista(s):\n\n");
  				for(int aux=0;aux<i;aux++)
  				{
  					if (funcionarios[aux][0].equals("5"))
  					{
  						System.out.print("\n-Motorista " + funcionarios[aux][1] + "\n\n");
  						System.out.print("\n-Email " + funcionarios[aux][2] + "\n\n");
  						System.out.print("\n-CPF " + funcionarios[aux][3] + "\n\n");
  						System.out.print("\n-Salario " + funcionarios[aux][4] + "\n\n");
  						System.out.print("\n-Telefone " + funcionarios[aux][5] + "\n\n");
  						System.out.print("\n-Numero de habilitacao " + funcionarios[aux][6] + "\n\n");
  					}
  				}
  				System.out.print("\nCozinheiro(s):\n\n");
  				for(int aux=0;aux<i;aux++)
  				{
  					if (funcionarios[aux][0].equals("6"))
  					{
  						System.out.print("\n-Cozinheiro " + funcionarios[aux][1] + "\n\n");
  						System.out.print("\n-Email " + funcionarios[aux][2] + "\n\n");
  						System.out.print("\n-CPF " + funcionarios[aux][3] + "\n\n");
  						System.out.print("\n-Salario " + funcionarios[aux][4] + "\n\n");
  						System.out.print("\n-Telefone " + funcionarios[aux][5] + "\n\n");
  					}
  				}
  				System.out.print("\nAdvogado(s):\n\n");
  				for(int aux=0;aux<i;aux++)
  				{
  					if (funcionarios[aux][0].equals("7"))
  					{
  						System.out.print("\n-Advogado " + funcionarios[aux][1] + "\n\n");
  						System.out.print("\n-Email " + funcionarios[aux][2] + "\n\n");
  						System.out.print("\n-CPF " + funcionarios[aux][3] + "\n\n");
  						System.out.print("\n-Salario " + funcionarios[aux][4] + "\n\n");
  						System.out.print("\n-Telefone " + funcionarios[aux][5] + "\n\n");
  					}
  				}
  			}
  		}
  		if(sagrado==1)
		{
			ent="2";
		}
  		if(ent.equals("2"))
  		{
  			if(sagrado==-1)
			{
  				System.out.print("\n1-Quantidade de socios\n\n2-Socios adimplentes\n\n3-Socios inadimplentes\n\n4-Todos dados\n\n");
  				ent2=obj.nextLine();
			}
			if(sagrado==1)
			{
				ent2="1";
			}
  			if(ent2.equals("1"))
  			{
  				System.out.print("\nQuantidade de socios: "+i2+"\n\n");
  			}
  			if(sagrado==1)
			{
				ent2="2";
			}
  			if(ent2.equals("2"))
  			{
  				int help=1;
  				for(int aux=0;aux<i2;aux++)
  				{
  					if ("adimplente".equalsIgnoreCase(socios[aux][7]))
  					{
  						System.out.print("\nSocio: "+socios[aux][1]+"\n\n");
  						help=-1;
  					}
  				}
  				if (help==1)
  				{
  					System.out.print("\nNenhum adimplente.\n\n");
  				}			
  			}
  			if(sagrado==1)
			{
				ent2="3";
			}
  			if(ent2.equals("3"))
  			{
  				int help=1;		
  				for(int aux=0;aux<i2;aux++)
  				{
  					if ("inadimplente".equalsIgnoreCase(socios[aux][7]))
  					{
  						System.out.print("\nSocio: "+socios[aux][1]+"\n\n");
  						help=-1;
  					}
  				}
  				if (help==1)
  				{
  					System.out.print("\nNenhum inadimplente.\n\n");
  				}	
  			}
  			if(ent2.equals("4"))
  			{
  				System.out.print("\nSocio(s)\n\n");
  				if (i2==0)
  				{
  					System.out.print("\n0\n\n");
  				}
  				else
  				{
  					for(int aux=0;aux<i2;aux++)
  					{
						System.out.print("\nNome "+socios[aux][1]+"\n\n");
						System.out.print("\nEmail "+socios[aux][2]+"\n\n");
						System.out.print("\nCPF "+socios[aux][3]+"\n\n");
						System.out.print("\nTelefone "+socios[aux][4]+"\n\n");
						System.out.print("\nEndereco "+socios[aux][5]+"\n\n");
						System.out.print("\nValor da contribuicao "+socios[aux][6]+"\n\n");
						System.out.print("\nStatus de pagamento atual "+socios[aux][7]+"\n\n");
						System.out.print("\nTipo de socio "+socios[aux][8]+"\n\n");
  					}
  				}
  			}
  		}
  		if(sagrado==1)
			{
				ent="3";
			}
  		if(ent.equals("3"))
  		{
  			if(sagrado==-1)
			{
				System.out.print("\n1-Transportes\n\n2-Centros de Treinamento\n\n3-Estadios\n\n");
  				ent2=obj.nextLine();
			}
			if(sagrado==1)
			{
				ent2="1";
			}
  			if(ent2.equals("1"))
  			{
  				int aux2=1;
  				for(int aux=0;aux<i3;aux++)
				{
					if (recursos[aux][0].equals("1"))
					{
						System.out.print("\nOnibus "+aux2+" Status "+recursos[aux][1]+"\n\n");
						aux2++;
					}
				}
				if (aux2==1)
				{
					System.out.print("\nNenhum Onibus\n\n");
				}
  			}
  			if(sagrado==1)
			{
				ent2="2";
			}
  			if(ent2.equals("2"))
  			{
  				int aux2=1;
  				for(int aux=0;aux<i3;aux++)
				{
					if (recursos[aux][0].equals("3"))
					{
						System.out.print("\nCT "+aux2+" Status "+recursos[aux][1]+" Dormitorios "+recursos[aux][2]+"\n\n");
						aux2++;
					}
				}
				if (aux2==1)
				{
					System.out.print("\nNenhum CT\n\n");
				}
  			}
  			if(sagrado==1)
			{
				ent2="3";
			}
  			if(ent2.equals("3"))
  			{
  				int aux2=1;
  				for(int aux=0;aux<i3;aux++)
				{
					if (recursos[aux][0].equals("2"))
					{
						System.out.print("\nEstadio "+aux2+" Status "+recursos[aux][1]+" Cadeiras "+recursos[aux][2]+" Banheiros "+recursos[aux][3]+" Lanchonetes "+recursos[aux][3]+"\n\n");
						aux2++;
					}
				}
				if (aux2==1)
				{
					System.out.print("\nNenhum Estadio\n\n");
				}
  			}
  		}
  		if(ent.equals("4"))
  		{
  			relatorios(1);
  		}
  	}
	public static void recursos(int i3, int j3)
	{
		System.out.print("\n1-Administrar Onibus\n\n2-Administrar Estadios\n\n3-Administrar Centro de Treinamento\n\n");
		Scanner obj=new Scanner(System.in);
		String ent=obj.nextLine();
		if (ent.equalsIgnoreCase("sair"))
		{
			System.exit(0);
		}
		else if (ent.equals("1"))
		{
			System.out.print("\n1-Adicionar Onibus\n\n2-Informar disponibilidade dos onibus atuais\n\n");
			ent=obj.nextLine();
			if (ent.equals("1"))
			{	
				System.out.print("\nOnibus adicionado\n\n");
				recursos[i3][j3]="1";
				recursos[i3][j3+1]="Indisponivel";
				senha.i3++;
			}
			else if (ent.equals("2"))
			{
				int aux2=0;
				for(int aux=0;aux<i3;aux++)
				{
					if (recursos[aux][j3].equals("1"))
					{
						aux2++;
					}
				}
				System.out.print("\n"+aux2+" Onibus existentes, deseja informar disponibilidade de quantos onibus?\n\n");
				int ento=obj.nextInt();
				String inutil=obj.nextLine();
				aux2=0;
				for(int aux=0;aux2<ento && aux<i3;aux++)
				{
					if (recursos[aux][j3].equals("1"))
					{
						recursos[aux][j3+1]="Disponivel";
						aux2++;
					}
				}
				System.out.print("\nOnibus disponibilizados\n\n");
			}
		}
		else if (ent.equals("2"))
		{
			System.out.print("\n1-Adicionar Estadio\n\n2-Informar disponibilidade de estadio\n\n3-Administrar numero de cadeiras, banheiros e lanchonetes\n\n");
			ent=obj.nextLine();
			if (ent.equals("1"))
			{
				System.out.print("\nEstadio adicionado\n\n");
				recursos[i3][j3]="2";
				recursos[i3][j3+1]="Indisponivel";
				recursos[i3][j3+2]="0";
				recursos[i3][j3+3]="0";
				recursos[i3][j3+4]="0";
				senha.i3++;
			}
			else if (ent.equals("2"))
			{
				int aux2=0;
				for(int aux=0;aux<i3;aux++)
				{
					if (recursos[aux][j3].equals("2"))
					{
						aux2++;
					}
				}
				System.out.print("\n"+aux2+" Estadios existentes, deseja informar disponibilidade de quantos estadios?\n\n");
				int ento=obj.nextInt();
				String inutil=obj.nextLine();
				aux2=0;
				for(int aux=0;aux2<ento && aux<i3;aux++)
				{
					if (recursos[aux][j3].equals("2"))
					{
						recursos[aux][j3+1]="Disponivel";
						aux2++;
					}
				}
				System.out.print("\nEstadios disponibilizados\n\n");
			}

			else if (ent.equals("3"))
			{
				int aux2=1;
				System.out.print("\nEstadios:\n\n");
				for(int aux=0;aux<i3;aux++)
				{
					if (recursos[aux][j3].equals("2"))
					{
						System.out.print("\nEstadio "+aux2+"\n\n");
						aux2++;
					}
				}
				System.out.print("\nDeseja administrar qual estadio?\n\n");
				int ento=obj.nextInt();
				String inutil=obj.nextLine();
				aux2=1;
				for(int aux=0;aux<i3;aux++)
				{
					if (recursos[aux][j3].equals("2"))
					{
						if(aux2==ento)
						{
							System.out.print("\nDigite numero de cadeiras.\n\n");
							recursos[aux][j3+2]=obj.nextLine();
							System.out.print("\nDigite numero de banheiros.\n\n");
							recursos[aux][j3+3]=obj.nextLine();
							System.out.print("\nDigite numero de lanchonetes.\n\n");
							recursos[aux][j3+4]=obj.nextLine();
						}
						aux2++;
					}
				}
				System.out.print("\nConcluido.\n\n");
			}
		}
		else if (ent.equals("3"))
		{
			System.out.print("\n1-Adicionar Centro de Treinamento\n\n2-Informar disponibilidade de centro de treinamento\n\n3-Administrar numero de dormitorios\n\n");
			ent=obj.nextLine();
			if (ent.equals("1"))
			{
				System.out.print("\nCT adicionado\n\n");
				recursos[i3][j3]="3";
				recursos[i3][j3+1]="Indisponivel";
				recursos[i3][j3+2]="0";
				senha.i3++;
			}
			else if (ent.equals("2"))
			{
				int aux2=0;
				for(int aux=0;aux<i3;aux++)
				{
					if (recursos[aux][j3].equals("3"))
					{
						aux2++;
					}
				}
				System.out.print("\n"+aux2+" CTs existentes, deseja informar disponibilidade de quantos CTs?\n\n");
				int ento=obj.nextInt();
				String inutil=obj.nextLine();
				aux2=0;
				for(int aux=0;aux2<ento && aux<i3;aux++)
				{
					if (recursos[aux][j3].equals("3"))
					{
						recursos[aux][j3+1]="Disponivel";
						aux2++;
					}
				}
				System.out.print("\nCTs disponibilizados\n\n");
			}

			else if (ent.equals("3"))
			{
				int aux2=1;
				System.out.print("\nCentros:\n\n");
				for(int aux=0;aux<i3;aux++)
				{
					if (recursos[aux][j3].equals("3"))
					{
						System.out.print("\nCT "+aux2+"\n\n");
						aux2++;
					}
				}
				System.out.print("\nDeseja administrar qual CT?\n\n");
				int ento=obj.nextInt();
				String inutil=obj.nextLine();
				aux2=1;
				for(int aux=0;aux<i3;aux++)
				{
					if (recursos[aux][j3].equals("3"))
					{
						if(aux2==ento)
						{
							System.out.print("\nDigite numero de dormitorios.\n\n");
							recursos[aux][j3+2]=obj.nextLine();
						}
						aux2++;
					}
				}
				System.out.print("\nConcluido.\n\n");
			}
		}
	}
	public static void sociotorcedores(int i2, int j2)
	{	
		System.out.print("\n1-Adicionar novos socios:\n\n2-Modificar socios\n\n");
		Scanner obj=new Scanner(System.in);
		String ent=obj.nextLine();
		if (ent.equalsIgnoreCase("sair"))
		{
			System.exit(0);
		}
		else if (ent.equals("1"))
		{
			socios[i2][j2]=Integer.toString(i2+1);
			System.out.print("\nDigite o nome do socio:\n\n");
			socios[i2][j2+1]=obj.nextLine();
			System.out.print("\nDigite o email do socio:\n\n");
			socios[i2][j2+2]=obj.nextLine();
			System.out.print("\nDigite o CPF do socio:\n\n");
			socios[i2][j2+3]=obj.nextLine();
			System.out.print("\nDigite o telefone do socio:\n\n");
			socios[i2][j2+4]=obj.nextLine();
			System.out.print("\nDigite o endereço do socio:\n\n");
			socios[i2][j2+5]=obj.nextLine();
			System.out.print("\nDigite o valor da contribuicao:\n\n");
			socios[i2][j2+6]=obj.nextLine();
			System.out.print("\nStatus do pagamento(adimplente ou inadimplente):\n\n");
			socios[i2][j2+7]=obj.nextLine();
			System.out.print("\nDigite o tipo de socio:\n\n");
			socios[i2][j2+8]=obj.nextLine();
			senha.i2++;
		}
		else if (ent.equals("2"))
		{
			System.out.print("\n1-Modificar estado de pagamentos dos socios adicionados:\n\n2-Modificar valor da contribuicao dos socios:\n\n");
			ent=obj.nextLine();
			if (ent.equalsIgnoreCase("sair"))
			{
				System.exit(0);
			}
			else if (ent.equals("1"))
			{
				for(int aux=0;aux<i2;aux++)
				{
					System.out.print("\nSocio Numero "+socios[aux][0]+"\n\n");
					System.out.print("\nNome "+socios[aux][1]+"\n\n");
					System.out.print("\nEmail "+socios[aux][2]+"\n\n");
					System.out.print("\nCPF "+socios[aux][3]+"\n\n");
					System.out.print("\nTelefone "+socios[aux][4]+"\n\n");
					System.out.print("\nEndereco "+socios[aux][5]+"\n\n");
					System.out.print("\nValor da contribuicao "+socios[aux][6]+"\n\n");
					System.out.print("\nStatus de pagamento atual "+socios[aux][7]+"\n\n");
					System.out.print("\nTipo de socio "+socios[aux][8]+"\n\n");
				}
				if(i2!=0)
				{
					System.out.print("\nDeseja modificar o estado de qual o socio(escolha seu numero):\n\n");
					int ent2=obj.nextInt();
					String inutil=obj.nextLine();
					System.out.print("\nDigite o novo estado:\n\n");
					socios[ent2-1][7]=obj.nextLine();
					System.out.print("\nSocio modificado.\n\n");
				}
				if(i2==0)
				{
					System.out.print("\nNenhum socio.\n\n");
				}
			}
			else if (ent.equals("2"))
			{
				System.out.print("\nModificar o valor da contribuicao de todos socios:\n\n1-Junior\n\n2-Senior\n\n3-Elite\n\n");
				ent=obj.nextLine();
				if (ent.equals("1"))
				{
					System.out.print("\nDigite o novo valor:\n\n");
					ent=obj.nextLine();
					for (int aux=0;aux<i2;aux++)
					{
						if ("junior".equalsIgnoreCase(socios[aux][8]))
						{
							socios[aux][6]=ent;
						}
					}
				}
				else if (ent.equals("2"))
				{
					System.out.print("\nDigite o novo valor:\n\n");
					ent=obj.nextLine();
					for (int aux=0;aux<i2;aux++)
					{
						if ("senior".equalsIgnoreCase(socios[aux][8]))
						{
							socios[aux][6]=ent;
						}
					}
				}
				else if (ent.equals("3"))
				{
					System.out.print("\nDigite o novo valor:\n\n");
					ent=obj.nextLine();
					for (int aux=0;aux<i2;aux++)
					{
						if ("elite".equalsIgnoreCase(socios[aux][8]))
						{
							socios[aux][6]=ent;
						}
					}
				}
				System.out.print("\nValor atualizado.\n\n");
			}
		}
	}
	public static void funcionarios(int i, int j)
	{
		Scanner obj=new Scanner(System.in);
		String funcionario=obj.nextLine();
		if (funcionario.equalsIgnoreCase("sair"))
		{
				System.exit(0);
		}
		else if (funcionario.equals("1"))//presidente
		{
			System.out.print("\nDigite o nome:\n\n");
			funcionarios[i][j]="1";
			funcionarios[i][j+1]=obj.nextLine();
			System.out.print("\nDigite o email:\n\n");
			funcionarios[i][j+2]=obj.nextLine();
			System.out.print("\nDigite o CPF:\n\n");
			funcionarios[i][j+3]=obj.nextLine();
			System.out.print("\nDigite o salario:\n\n");
			funcionarios[i][j+4]=obj.nextLine();
			System.out.print("\nDigite o telefone:\n\n");
			funcionarios[i][j+5]=obj.nextLine();
			System.out.print("\nFuncionario adicionado.\n\n");
			senha.i++;
			return;
		}
		else if (funcionario.equals("2"))//medico
		{
			System.out.print("\nDigite o nome:\n\n");
			funcionarios[i][j]="2";
			funcionarios[i][j+1]=obj.nextLine();
			System.out.print("\nDigite o email:\n\n");
			funcionarios[i][j+2]=obj.nextLine();
			System.out.print("\nDigite o CPF:\n\n");
			funcionarios[i][j+3]=obj.nextLine();
			System.out.print("\nDigite o salario:\n\n");
			funcionarios[i][j+4]=obj.nextLine();
			System.out.print("\nDigite o telefone:\n\n");
			funcionarios[i][j+5]=obj.nextLine();
			System.out.print("\nDigite o CRM:\n\n");
			funcionarios[i][j+6]=obj.nextLine();
			System.out.print("\nFuncionario adicionado.\n\n");
			senha.i++;
			return;
		}
		else if (funcionario.equals("3"))//tecnico
		{
			System.out.print("\nDigite o nome:\n\n");
			funcionarios[i][j]="3";
			funcionarios[i][j+1]=obj.nextLine();
			System.out.print("\nDigite o email:\n\n");
			funcionarios[i][j+2]=obj.nextLine();
			System.out.print("\nDigite o CPF:\n\n");
			funcionarios[i][j+3]=obj.nextLine();
			System.out.print("\nDigite o salario:\n\n");
			funcionarios[i][j+4]=obj.nextLine();
			System.out.print("\nDigite o telefone:\n\n");
			funcionarios[i][j+5]=obj.nextLine();
			System.out.print("\nFuncionario adicionado.\n\n");
			senha.i++;
			return;
		}
		else if (funcionario.equals("4"))//preparador fisico
		{
			System.out.print("\nDigite o nome:\n\n");
			funcionarios[i][j]="4";
			funcionarios[i][j+1]=obj.nextLine();
			System.out.print("\nDigite o email:\n\n");
			funcionarios[i][j+2]=obj.nextLine();
			System.out.print("\nDigite o CPF:\n\n");
			funcionarios[i][j+3]=obj.nextLine();
			System.out.print("\nDigite o salario:\n\n");
			funcionarios[i][j+4]=obj.nextLine();
			System.out.print("\nDigite o telefone:\n\n");
			funcionarios[i][j+5]=obj.nextLine();
			System.out.print("\nFuncionario adicionado.\n\n");
			senha.i++;
			return;
		}
		else if (funcionario.equals("5"))//motorista
		{
			System.out.print("\nDigite o nome:\n\n");
			funcionarios[i][j]="5";
			funcionarios[i][j+1]=obj.nextLine();
			System.out.print("\nDigite o email:\n\n");
			funcionarios[i][j+2]=obj.nextLine();
			System.out.print("\nDigite o CPF:\n\n");
			funcionarios[i][j+3]=obj.nextLine();
			System.out.print("\nDigite o salario:\n\n");
			funcionarios[i][j+4]=obj.nextLine();
			System.out.print("\nDigite o telefone:\n\n");
			funcionarios[i][j+5]=obj.nextLine();
			System.out.print("\nDigite o numero de habilitacao:\n\n");
			funcionarios[i][j+6]=obj.nextLine();
			System.out.print("\nFuncionario adicionado.\n\n");
			senha.i++;
			return;
		}
		else if (funcionario.equals("6"))//cozinheiro
		{
			System.out.print("\nDigite o nome:\n\n");
			funcionarios[i][j]="6";
			funcionarios[i][j+1]=obj.nextLine();
			System.out.print("\nDigite o email:\n\n");
			funcionarios[i][j+2]=obj.nextLine();
			System.out.print("\nDigite o CPF:\n\n");
			funcionarios[i][j+3]=obj.nextLine();
			System.out.print("\nDigite o salario:\n\n");
			funcionarios[i][j+4]=obj.nextLine();
			System.out.print("\nDigite o telefone:\n\n");
			funcionarios[i][j+5]=obj.nextLine();
			System.out.print("\nFuncionario adicionado.\n\n");
			senha.i++;
			return;
		}
		else if (funcionario.equals("7"))//advogados
		{
			System.out.print("\nDigite o nome:\n\n");
			funcionarios[i][j]="7";
			funcionarios[i][j+1]=obj.nextLine();
			System.out.print("\nDigite o email:\n\n");
			funcionarios[i][j+2]=obj.nextLine();
			System.out.print("\nDigite o CPF:\n\n");
			funcionarios[i][j+3]=obj.nextLine();
			System.out.print("\nDigite o salario:\n\n");
			funcionarios[i][j+4]=obj.nextLine();
			System.out.print("\nDigite o telefone:\n\n");
			funcionarios[i][j+5]=obj.nextLine();
			System.out.print("\nFuncionario adicionado.\n\n");
			senha.i++;
			return;
		}
		else if (funcionario.equals("8"))//jogador
		{
			System.out.print("\nDigite o nome:\n\n");
			funcionarios[i][j]="8";
			funcionarios[i][j+1]=obj.nextLine();
			System.out.print("\nDigite o email:\n\n");
			funcionarios[i][j+2]=obj.nextLine();
			System.out.print("\nDigite o CPF:\n\n");
			funcionarios[i][j+3]=obj.nextLine();
			System.out.print("\nDigite o salario:\n\n");
			funcionarios[i][j+4]=obj.nextLine();
			System.out.print("\nDigite o telefone:\n\n");
			funcionarios[i][j+5]=obj.nextLine();
			System.out.print("\nDigite o tipo de jogador:\n\n");
			funcionarios[i][j+6]=obj.nextLine();
			System.out.print("\nDigite se o jogador esta apto ou nao-apto:\n\n");
			funcionarios[i][j+7]=obj.nextLine();
			System.out.print("\nFuncionario adicionado.\n\n");
			senha.i++;
			return;
		}
	}
	public static void login()
	{
		String login="admin", senha="123456", ent="";
		Scanner obj=new Scanner(System.in);
		while(login.equals(ent)==false)
		{
			System.out.print("\nDigite o login:\n\n");
			ent=obj.nextLine();
			if(login.equals(ent)==false)
			{
				System.out.print("\nLogin incorreto.\n\n");
			}
			if(ent.equalsIgnoreCase("sair"))
			{
				System.exit(0);
			}
		}
		while(senha.equals(ent)==false)
		{
			System.out.print("\nDigite a senha:\n\n");
			ent=obj.nextLine();
			if(senha.equals(ent)==false)
			{
				System.out.print("\nSenha incorreta.\n\n");
			}
			if(ent.equalsIgnoreCase("sair"))
			{
				System.exit(0);
			}
		}
	}
  	public static void main(String[] args) 
  	{
  		System.out.print("\nBem vindo, faca login, digite sair quando quiser sair.\n\n");
  		login();
  		String ent="";
  		System.out.print("\nLogin aceito.\n\n");
  		while(ent.equalsIgnoreCase("sair")==false)
  		{
  			System.out.print("\nSelecione:\n\n");
  			System.out.print("\n1-Adicionar funcionarios\n\n2-Adicionar ou modificar socio-torcedores\n\n3-Administrar recursos fisicos\n\n4-Solicitar relatorios\n\n");
  			Scanner obj=new Scanner(System.in);
  			ent=obj.nextLine();
  			if(ent.equalsIgnoreCase("sair"))
  			{
  				System.exit(0);
  			}
  			else if(ent.equals("1"))
  			{
  				System.out.print("\nAdicione funcionarios:\n\n");
  				System.out.print("\n1-Presidente\n\n2-Medicos\n\n3-Tecnico\n\n4-Preparadores fisicos\n\n5-Motoristas\n\n6-Cozinheiros\n\n7-Advogados\n\n8-Jogador\n\n");
  				funcionarios(i,0);
  			}
  			else if(ent.equals("2"))
  			{
  				System.out.print("\nAdministre socio-torcedores:\n\n");
  				sociotorcedores(i2,0);
  			}
  			else if(ent.equals("3"))
  			{
  				System.out.print("\nAdministre recursos:\n\n");
  				recursos(i3,0);
  			}
  			else if(ent.equals("4"))
  			{
  				relatorios(-1);
  			}
  		}
  	}	
}
