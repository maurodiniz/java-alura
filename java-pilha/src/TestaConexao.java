
public class TestaConexao {

	public static void main(String[] args) {
		
		try(Conexao con = new Conexao() ){
			con.leDados();
		}catch(IllegalStateException e) {
			System.out.println("Exceção do tipo "+e.getMessage()+" detectada!");
		}
		
		
		
		
		//--------------------------------------------------------------
	/*	
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
		} catch(IllegalStateException e) {
			System.out.println("Excecao do tipo "+e.getMessage()+" detectada.");
		} finally {
			if(con != null) {
				con.close();
			}			
		} */
	}
}
