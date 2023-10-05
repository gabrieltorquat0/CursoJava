package Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TiposDeConta.ContaCorrente;
import TiposDeConta.ContaPoupança;

public class AberturaConta {

	public static void main(String[] args) {
		
		int escolha = 0;
		boolean achou = false;
		
		Scanner scanner = new Scanner(System.in);
		
		// INICIALIZANDO AS LISTAS
		List<ContaCorrente> listaCorrente = new ArrayList<ContaCorrente>();
		List<ContaPoupança> listaPoupanca = new ArrayList<ContaPoupança>();
		
		do { // INICIO DO MENU
			
			// INICIO DO PROGRAMA
			System.out.println("Bem Vindo ao Banco, o que deseja fazer?");
			
			// VERIFICA SE A LISTA DE CONTAS CORRENTES ESTÁ VAZIA
			if (listaCorrente.isEmpty())
			{
				System.out.println("\nNão possui contas Correntes cadastradas");
			} 
			
			// CASO HAJA CONTAS, IMPRIMIR O EXTRATO DE TODAS
			else
			{
				System.out.println("Contas Correntes cadastradas: \n");
				for (int i = 0;i<=listaCorrente.size()-1;i++)
				{
					listaCorrente.get(i).imprimirExtrato();
				}

			}
			
			// VERIFICA SE A LISTA DE CONTA POUPANÇAS ESTÁ VAZIA
			if (listaPoupanca.isEmpty())
			{
				System.out.println("Não possui contas Poupanças cadastradas\n");
			}
			
			// CASO HAJA CONTAS, IMPRIMIR EXTRATO DE TODAS
			else
			{
				System.out.println("\nContas Poupanças cadastradas: ");
				for (int i = 0;i<=listaPoupanca.size()-1;i++)
				{
					listaPoupanca.get(i).imprimirExtrato();
				}
			}
			
			// IMPRIMIR OPÇÕES DO MENU
			System.out.println("1 - Criar nova conta Corrente" + 
							   "\n2 - Criar nova conta Poupança" +
							   "\n3 - Depositar em alguma conta" + 
							   "\n4 - Sacar de alguma conta" +
							   "\n5 - Transferência de conta para conta" + 
							   "\n9 - Sair");
			
			escolha = scanner.nextInt();
			
			switch (escolha)
			{
			// CRIAR NOVA CONTA CORRENTE
			case 1:
				ContaCorrente novaCorrente = new ContaCorrente();
				listaCorrente.add(novaCorrente);
				
				System.out.println("Nova Conta Corrente cadastrada!");
				break;
			// FIM DO CASE 1 ----------------------------------------------------------
				
			// CRIAR NOVA CONTA POUPANÇA
			case 2:
				ContaPoupança novaPoupanca = new ContaPoupança();
				listaPoupanca.add(novaPoupanca);
				
				System.out.println("Nova Conta Poupança cadastrada!");
				break;
			// FIM DO CASE 2 ----------------------------------------------------------	
			
			// DEPOSITAR EM ALGUMA CONTA
			case 3:
				
				int escolha2 = 0;
				
				// VERIFICA SE AMBAS AS LISTAS ESTÃO VAZIAS, SE SIM, SAI IMEDIATAMENTE
				if (listaCorrente.isEmpty() && listaPoupanca.isEmpty())
				{
					System.out.println("Não existem contas cadastradas");
					break;
				}
				
				
				do {
				
				// 
				System.out.println("Qual tipo de conta deseja depositar? \n" + 
								   "1 - Conta Corrente\n" +
								   "2 - Conta Poupanca\n");
				escolha2 = scanner.nextInt();
				
				// SWITCH PARA SELECIONAR O TIPO DE CONTA
				switch (escolha2)
				{
				
				// CONTA CORRENTE
				case 1:
					if (listaCorrente.isEmpty())
					{
						System.out.println("Não existem contas correntes cadastradas");
						break;
					}
					System.out.println("\nContas Correntes cadastradas: ");
					System.out.println("\nQual conta deseja depositar?");
					achou = false;
					
					do // DO WHILE PARA VERIFICAR A CONTA SELECIONADA
					{
					for (int i = 0;i<=listaCorrente.size()-1;i++)
					{
						listaCorrente.get(i).imprimirExtrato();
					}
					
					
					int escolha3 = 0;
					escolha3 = scanner.nextInt();
					int index = 0;
					
					for(int i = 0;i<=listaCorrente.size()-1;i++)
					{
						if (listaCorrente.get(i).getNumero() == escolha3)
						{
							achou = true;
							index = i;
							break;
						}
					}
					
					if (!achou)
					{
						System.out.println("Não foi possível identificar a conta digitada, favor digitar um numero valido");
					}
					else
					{
						System.out.println("Conta selecionada: ");
						listaCorrente.get(index).imprimirExtrato();
						
						System.out.println("Quanto deseja depositar? \n");
						double deposito = 0;
						deposito = scanner.nextDouble();
						
						listaCorrente.get(index).depositar(deposito);
					}
					
					}while(!achou); // FIM DO DO WHILE PARA VERIFICAR AS CONTAS
					
				break;
				// ------------------------------------------------------------------
					
				// CONTA POUPANÇA
				case 2:
					
					if (listaPoupanca.isEmpty())
					{
						System.out.println("Não existem contas poupanças cadastradas");
						break;
					}
					
					System.out.println("\nContas Poupanças cadastradas: ");
					System.out.println("\nQual conta deseja depositar?");
					achou = false;
					
					do // DO WHILE PARA VERIFICAR A CONTA SELECIONADA
					{
					for (int i = 0;i<=listaPoupanca.size()-1;i++)
					{
						listaPoupanca.get(i).imprimirExtrato();
					}
					
					
					int escolha3 = 0;
					escolha3 = scanner.nextInt();
					int index = 0;
					
					for(int i = 0;i<=listaPoupanca.size()-1;i++)
					{
						if (listaPoupanca.get(i).getNumero() == escolha3)
						{
							achou = true;
							index = i;
							break;
						}
					}
					
					if (!achou)
					{
						System.out.println("Não foi possível identificar a conta digitada, favor digitar um numero valido");
					}
					else
					{
						System.out.println("Conta selecionada: ");
						listaPoupanca.get(index).imprimirExtrato();
						
						System.out.println("Quanto deseja depositar? \n");
						double deposito = 0;
						deposito = scanner.nextDouble();
						
						listaPoupanca.get(index).depositar(deposito);
					}
					
					}while(!achou); // FIM DO DO WHILE DE VERIFICAÇÃO DAS CONTAS
					
				break;
				
				}
				
				}while(escolha2 != 1 && escolha2 != 2);
				break;
				// FIM DO CASE 3 -------------------------------------------------------------------
			
				// OPÇÃO DE SACAR
			case 4:
				
				if (listaCorrente.isEmpty() && listaPoupanca.isEmpty())
				{
					System.out.println("Não existem contas cadastradas");
					break;
				}
				
				do // DO WHILE PARA VERIFICAR QUAL TIPO DE CONTA SERÁ SELECIONADA
				{
					escolha2 = 0;
					System.out.println("Qual tipo de conta deseja sacar? \n" + 
							   "1 - Conta Corrente\n" +
							   "2 - Conta Poupanca\n");
					escolha2 = scanner.nextInt();
					
					// -- SWITCH PARA VERIFICAR O TIPO DE CONTA
					switch (escolha2)
					{
					
					// SELECIONANDO CONTA CORRENTE
					case 1:
						if (listaCorrente.isEmpty())
						{
							System.out.println("Não foram encontradas contas correntes");
							break;
						}
						
						System.out.println("\nContas Correntes cadastradas: ");
						System.out.println("\nQual conta deseja sacar?");
						achou = false;
						
						do // DO WHILE PARA VERIFICAR A CONTA SELECIONADA
						{
						for (int i = 0;i<=listaCorrente.size()-1;i++)
						{
							listaCorrente.get(i).imprimirExtrato();
						}
						
						
						int escolha3 = 0;
						escolha3 = scanner.nextInt();
						int index = 0;
						
						for(int i = 0;i<=listaCorrente.size()-1;i++)
						{
							if (listaCorrente.get(i).getNumero() == escolha3)
							{
								achou = true;
								index = i;
								break;
							}
						}
						
						if (!achou)
						{
							System.out.println("Não foi possível identificar a conta digitada, favor digitar um numero valido");
						}
						else
						{
							System.out.println("Conta selecionada: ");
							listaCorrente.get(index).imprimirExtrato();
							
							System.out.println("Quanto deseja sacar? \n");
							double saque = 0;
							saque = scanner.nextDouble();
							
							listaCorrente.get(index).sacar(saque);
						}
						
						}while(!achou); // FIM DO DO WHILE PARA VERIFICAR AS CONTAS
						
						break;
					// -- FIM DA OPÇAO CONTA CORRENTE
						
					// SELECIONANDO CONTA POUPANÇA
					case 2:
						
						if (listaPoupanca.isEmpty())
						{
							System.out.println("Não existem contas poupanças cadastradas");
							break;
						}
						
						System.out.println("\nContas Poupanças cadastradas: ");
						System.out.println("\nQual conta deseja sacar?");
						achou = false;
						
						do // DO WHILE PARA VERIFICAR A CONTA SELECIONADA
						{
						for (int i = 0;i<=listaPoupanca.size()-1;i++)
						{
							listaPoupanca.get(i).imprimirExtrato();
						}
						
						
						int escolha3 = 0;
						escolha3 = scanner.nextInt();
						int index = 0;
						
						for(int i = 0;i<=listaPoupanca.size()-1;i++)
						{
							if (listaPoupanca.get(i).getNumero() == escolha3)
							{
								achou = true;
								index = i;
								break;
							}
						}
						
						if (!achou)
						{
							System.out.println("Não foi possível identificar a conta digitada, favor digitar um numero valido");
						}
						else
						{
							System.out.println("Conta selecionada: ");
							listaPoupanca.get(index).imprimirExtrato();
							
							System.out.println("Quanto deseja sacar? \n");
							double saque = 0;
							saque = scanner.nextDouble();
							
							listaPoupanca.get(index).sacar(saque);
						}
						
						}while(!achou);
						
					break;
					// -- FIM DA OPÇÃO CONTA POUPANÇA
						
					} // -- FIM DO SWITCH PARA VERIFICAR TIPO DE CONTA
					
				} while (escolha2 != 1 && escolha2 != 2); // FIM - DO WHILE DE VERIFICAÇÃO DE QUAL TIPO DE CONTA
				
			break;
			// FIM DA OPÇÃO DE SACAR
				
			// INICIO DA OPÇÃO DE TRANSFERÊNCIA
			case 5:
				
				if (listaCorrente.isEmpty() && listaPoupanca.isEmpty())
				{
					System.out.println("Não estão cadastradas contas para realizar a transferência");
					break;
				}
				
				do // INICIO DO WHILE PARA VERIFICAÇÃO DE CONTA
				{
					escolha2 = 0;
					System.out.println("Qual tipo de conta deseja retirar o dinheiro? \n" + 
										"1 - Conta Corrente\n" +
										"2 - Conta Poupanca\n");
					escolha2 = scanner.nextInt();
					
					switch (escolha2) // INICIO SWITCH DE VERIFICAÇÃO DE CONTA
					{
					
					// -- OPÇÃO CONTA CORRENTE 
					case 1:
						if (listaCorrente.isEmpty())
						{
							System.out.println("Não há contas correntes cadastradas");
							break;
						}
						
						System.out.println("\nContas Correntes cadastradas: ");
						System.out.println("\nQual conta deseja retirar o dinheiro?");
						achou = false;
						
						do // DO WHILE PARA VERIFICAR A CONTA SELECIONADA
						{
						for (int i = 0;i<=listaCorrente.size()-1;i++)
						{
							listaCorrente.get(i).imprimirExtrato();
						}
						
						
						int escolha3 = 0;
						escolha3 = scanner.nextInt();
						int index = 0;
						
						for(int i = 0;i<=listaCorrente.size()-1;i++)
						{
							if (listaCorrente.get(i).getNumero() == escolha3)
							{
								achou = true;
								index = i;
								break;
							}
						}
						
						if (!achou)
						{
							System.out.println("Não foi possível identificar a conta digitada, favor digitar um numero valido");
						}
						
						// INICIO DO PROCESSO DE TRANSFERÊNCIA
						else
						{
							System.out.println("Conta selecionada: ");
							listaCorrente.get(index).imprimirExtrato();
							
							System.out.println("Quanto deseja transferir? \n");
							double transferencia = 0;
							transferencia = scanner.nextDouble();
							
							
							do // INICIO DO PROCESSO DE SELECIONAR A CONTA QUE RECEBERÁ O VALOR
							{
								escolha2 = 0;
								System.out.println("Qual tipo de conta que receberá a transferência? \n" + 
													"1 - Conta Corrente\n" +
													"2 - Conta Poupanca\n");
								
								escolha2 = scanner.nextInt();
								
								switch (escolha2) // INICIO SWITCH PARA VERIFICAR QUAL CONTA RECEBERA O VALOR
								{
								
								// OPÇÃO CONTA CORRENTE
								case 1:
									do // INICIO DO LOOP PARA ENCONTRAR A CONTA QUE RECEBERA O DINHEIRO
									{
									System.out.println("\nContas Correntes cadastradas: ");
									System.out.println("\nQual conta deseja enviar o dinheiro?");
									achou = false;
									
									for (int i = 0;i<=listaCorrente.size()-1;i++)
									{
										listaCorrente.get(i).imprimirExtrato();
									}
									
									escolha3 = 0;
									escolha3 = scanner.nextInt();
									int index2 = 0;
									
									for(int i = 0;i<=listaCorrente.size()-1;i++)
									{
										if (listaCorrente.get(i).getNumero() == escolha3)
										{
											achou = true;
											index2 = i;
											break;
										}
									}
									
									if (!achou)
									{
										System.out.println("Não foi possível identificar a conta digitada, favor digitar um numero valido");
									}
									else
									{
										System.out.println("Conta selecionada: ");
										listaCorrente.get(index2).imprimirExtrato();
										
										System.out.println("Realizando a transferência..." +	
															"\nConta enviando: Agencia: " + listaCorrente.get(index).getAgencia() + " Numero: " + listaCorrente.get(index).getNumero() + " Saldo atual: R$" + listaCorrente.get(index).getSaldo() + " Quantidade sendo transferida: R$" + transferencia + 
															"\nConta recebendo: Agencia: " + listaCorrente.get(index2).getAgencia() + " Numero: " + listaCorrente.get(index2).getNumero() + " Saldo atual: R$" + listaCorrente.get(index2).getSaldo());
										
										listaCorrente.get(index).transferir(transferencia, listaCorrente.get(index2));
										
										System.out.println("Imprimindo extrato: \n");
										listaCorrente.get(index).imprimirExtrato();
										listaCorrente.get(index2).imprimirExtrato();
										
										
									}
									
									}while(!achou); // FIM DO LOOP PARA ENCONTRAR A CONTA QUE RECEBERA O DINHEIRO
									
									break;
								// FIM DA OPÇÃO CONTA CORRENTE
									
								// OPÇÃO CONTA POUPANÇA
								case 2:
									
									if (listaPoupanca.isEmpty())
									{
										System.out.println("Não existem contas poupanças cadastradas");
										break;
									}
									
									do // INICIO DO LOOP PARA ENCONTRAR A CONTA QUE RECEBERA O DINHEIRO
									{
									System.out.println("\nContas Poupanças cadastradas: ");
									System.out.println("\nQual conta deseja enviar o dinheiro?");
									achou = false;
									
									for (int i = 0;i<=listaPoupanca.size()-1;i++)
									{
										listaPoupanca.get(i).imprimirExtrato();
									}
									
									escolha3 = 0;
									escolha3 = scanner.nextInt();
									int index2 = 0;
									
									for(int i = 0;i<=listaPoupanca.size()-1;i++)
									{
										if (listaPoupanca.get(i).getNumero() == escolha3)
										{
											achou = true;
											index2 = i;
											break;
										}
									}
									
									if (!achou)
									{
										System.out.println("Não foi possível identificar a conta digitada, favor digitar um numero valido");
									}
									else
									{
										System.out.println("Conta selecionada: ");
										listaPoupanca.get(index2).imprimirExtrato();
										
										System.out.println("Realizando a transferência..." +	
															"\nConta enviando: Agencia: " + listaCorrente.get(index).getAgencia() + " Numero: " + listaCorrente.get(index).getNumero() + " Saldo atual: R$" + listaCorrente.get(index).getSaldo() + " Quantidade sendo transferida: R$" + transferencia + 
															"\nConta recebendo: Agencia: " + listaPoupanca.get(index2).getAgencia() + " Numero: " + listaPoupanca.get(index2).getNumero() + " Saldo atual: R$" + listaPoupanca.get(index2).getSaldo());
										
										listaCorrente.get(index).transferir(transferencia, listaPoupanca.get(index2));
										
										System.out.println("Imprimindo extrato: \n");
										listaCorrente.get(index).imprimirExtrato();
										listaPoupanca.get(index2).imprimirExtrato();
										
										
									}
									
									}while(!achou); // FIM DO LOOP PARA ENCONTRAR A CONTA QUE RECEBERA O DINHEIRO
									
									break;
								// FIM OPÇÃO CONTA POUPANÇA
									
									
								} // FIM DO SWITCH PARA VERIFICAR QUAL CONTA RECEBERA O VALOR
								
							} while(escolha2 !=1 && escolha2 !=2); // FIM DO PROCESSO QUE RECEBERÁ O VALOR
							
							
						}
						
						}while(!achou); // FIM DO DO WHILE PARA VERIFICAR
						
					break;
					// -- FIM OPÇÃO CONTA CORRENTE
					
					// -- OPÇÃO CONTA POUPANÇA
					case 2:
						if (listaPoupanca.isEmpty())
						{
							System.out.println("Não há contas poupanças cadastradas");
							break;
						}
						
						System.out.println("\nContas Poupanças cadastradas: ");
						System.out.println("\nQual conta deseja retirar o dinheiro?");
						achou = false;
						
						do // DO WHILE PARA VERIFICAR A CONTA SELECIONADA
						{
						for (int i = 0;i<=listaPoupanca.size()-1;i++)
						{
							listaPoupanca.get(i).imprimirExtrato();
						}
						
						
						int escolha3 = 0;
						escolha3 = scanner.nextInt();
						int index = 0;
						
						for(int i = 0;i<=listaPoupanca.size()-1;i++)
						{
							if (listaPoupanca.get(i).getNumero() == escolha3)
							{
								achou = true;
								index = i;
								break;
							}
						}
						
						if (!achou)
						{
							System.out.println("Não foi possível identificar a conta digitada, favor digitar um numero valido");
						}
						
						// INICIO DO PROCESSO DE TRANSFERÊNCIA
						else
						{
							System.out.println("Conta selecionada: ");
							listaPoupanca.get(index).imprimirExtrato();
							
							System.out.println("Quanto deseja transferir? \n");
							double transferencia = 0;
							transferencia = scanner.nextDouble();
							
							
							do // INICIO DO PROCESSO DE SELECIONAR A CONTA QUE RECEBERÁ O VALOR
							{
								escolha2 = 0;
								System.out.println("Qual tipo de conta que receberá a transferência? \n" + 
													"1 - Conta Corrente\n" +
													"2 - Conta Poupanca\n");
								
								escolha2 = scanner.nextInt();
								
								switch (escolha2) // INICIO SWITCH PARA VERIFICAR QUAL CONTA RECEBERA O VALOR
								{
								
								// OPÇÃO CONTA CORRENTE
								case 1:
									
									if (listaCorrente.isEmpty())
									{
										System.out.println("Não há cadastrada nenhuma Conta Corrente");
										escolha2 = 3;
										break;
									}
									
									do // INICIO DO LOOP PARA ENCONTRAR A CONTA QUE RECEBERA O DINHEIRO
									{
									System.out.println("\nContas Correntes cadastradas: ");
									System.out.println("\nQual conta deseja enviar o dinheiro?");
									achou = false;
									
									for (int i = 0;i<=listaCorrente.size()-1;i++)
									{
										listaCorrente.get(i).imprimirExtrato();
									}
									
									escolha3 = 0;
									escolha3 = scanner.nextInt();
									int index2 = 0;
									
									for(int i = 0;i<=listaCorrente.size()-1;i++)
									{
										if (listaCorrente.get(i).getNumero() == escolha3)
										{
											achou = true;
											index2 = i;
											break;
										}
									}
									
									if (!achou)
									{
										System.out.println("Não foi possível identificar a conta digitada, favor digitar um numero valido");
									}
									else
									{
										System.out.println("Conta selecionada: ");
										listaCorrente.get(index2).imprimirExtrato();
										
										System.out.println("Realizando a transferência..." +	
															"\nConta enviando: Agencia: " + listaPoupanca.get(index).getAgencia() + " Numero: " + listaPoupanca.get(index).getNumero() + " Saldo atual: R$" + listaPoupanca.get(index).getSaldo() + " Quantidade sendo transferida: R$" + transferencia + 
															"\nConta recebendo: Agencia: " + listaCorrente.get(index2).getAgencia() + " Numero: " + listaCorrente.get(index2).getNumero() + " Saldo atual: R$" + listaCorrente.get(index2).getSaldo());
										
										listaPoupanca.get(index).transferir(transferencia, listaCorrente.get(index2));
										
										System.out.println("Imprimindo extrato: \n");
										listaPoupanca.get(index).imprimirExtrato();
										listaCorrente.get(index2).imprimirExtrato();
										
										
									}
									
									}while(!achou); // FIM DO LOOP PARA ENCONTRAR A CONTA QUE RECEBERA O DINHEIRO
									
									break;
								// FIM DA OPÇÃO CONTA CORRENTE
									
								// OPÇÃO CONTA POUPANÇA
								case 2:
									
									
									do // INICIO DO LOOP PARA ENCONTRAR A CONTA QUE RECEBERA O DINHEIRO
									{
									System.out.println("\nContas Poupanças cadastradas: ");
									System.out.println("\nQual conta deseja enviar o dinheiro?");
									achou = false;
									
									for (int i = 0;i<=listaPoupanca.size()-1;i++)
									{
										listaPoupanca.get(i).imprimirExtrato();
									}
									
									escolha3 = 0;
									escolha3 = scanner.nextInt();
									int index2 = 0;
									
									for(int i = 0;i<=listaPoupanca.size()-1;i++)
									{
										if (listaPoupanca.get(i).getNumero() == escolha3)
										{
											achou = true;
											index2 = i;
											break;
										}
									}
									
									if (!achou)
									{
										System.out.println("Não foi possível identificar a conta digitada, favor digitar um numero valido");
									}
									else
									{
										System.out.println("Conta selecionada: ");
										listaPoupanca.get(index2).imprimirExtrato();
										
										System.out.println("Realizando a transferência..." +	
															"\nConta enviando: Agencia: " + listaPoupanca.get(index).getAgencia() + " Numero: " + listaPoupanca.get(index).getNumero() + " Saldo atual: R$" + listaPoupanca.get(index).getSaldo() + " Quantidade sendo transferida: R$" + transferencia + 
															"\nConta recebendo: Agencia: " + listaPoupanca.get(index2).getAgencia() + " Numero: " + listaPoupanca.get(index2).getNumero() + " Saldo atual: R$" + listaPoupanca.get(index2).getSaldo());
										
										listaPoupanca.get(index).transferir(transferencia, listaPoupanca.get(index2));
										
										System.out.println("Imprimindo extrato: \n");
										listaPoupanca.get(index).imprimirExtrato();
										listaPoupanca.get(index2).imprimirExtrato();
										
									}
									
									}while(!achou); // FIM DO LOOP PARA ENCONTRAR A CONTA QUE RECEBERA O DINHEIRO
									
									break;
								// FIM OPÇÃO CONTA POUPANÇA
									
									
								} // FIM DO SWITCH PARA VERIFICAR QUAL CONTA RECEBERA O VALOR
								
							} while(escolha2 !=1 && escolha2 !=2); // FIM DO PROCESSO QUE RECEBERÁ O VALOR
						}
						
						}while(!achou); // FIM DO DO WHILE PARA VERIFICAR
					break;
					// -- FIM OPÇÃO CONTA POUPANÇA
					
					} // FIM SWITCH DE VERIFICAÇÃO DE CONTA
					
				}while(escolha2 != 1 && escolha2 != 2); // FIM DO WHILE DE VERIFICAÇÃO DE CONTA
				
				
			break;
			// FIM DA OPÇÃO DE TRANSFERÊNCIA
				
			}
			
		}while(escolha!=9); // FIM DO MENU
		
		scanner.close();

	}
	
}
