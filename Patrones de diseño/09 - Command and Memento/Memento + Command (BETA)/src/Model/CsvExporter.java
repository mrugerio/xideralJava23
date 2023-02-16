package Model;

import java.io.PrintWriter;
import java.util.Set;


public class CsvExporter implements IObserver<IContable> {

	public String filenameString = "default.csv";

	public CsvExporter(String filename) {
		this.filenameString = filename;
	}

	@Override
	public void actualizar(Set<? extends IContable> elementosDeGrafica) {

		try (PrintWriter esc = new PrintWriter(filenameString)) {
			for (IContable contable : elementosDeGrafica) {
				esc.print(contable.getNombre() + ",");
				esc.print(contable.getCuenta());
				esc.println();

			}
			esc.close();
		} catch (Exception e) {
		}
	}
}
