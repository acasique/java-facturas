package facturas.pdf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class PDF {
	
	
	
	public static void generarEjemploPdf() throws IOException {
		
		PDDocument pdf = new PDDocument();
		
		PDPage pagina = new PDPage();
	
		pdf.addPage(pagina);
		
		
		pagina = pdf.getPage(0);
		
		PDPageContentStream cs = new PDPageContentStream(pdf, pagina);
		
		cs.beginText(); 
		cs.setFont(PDType1Font.TIMES_ROMAN, 18); 
		cs.newLineAtOffset(150, 750);
		
		
		String tituloFactura = new String("Empresa SA de CV");
		
		cs.showText(tituloFactura);
		
		cs.endText(); 
		
		cs.close();
		
		
		//Saving the PDF
		pdf.save(System.currentTimeMillis()+ ".pdf");
	}
	
	
	 PDDocument invc;
	  int n = 2; 
	  Integer total = 0;
	  Integer price = 0;;
	  String CustName="Buen Día";
	  String CustPh = "CustPh";
	  List<String> ProductName = new ArrayList<String>();
	  List<Integer> ProductPrice = new ArrayList<Integer>();
	  List<Integer> ProductQty = new ArrayList<Integer>();
	  String invoiceTitle = new String("CodeSpeedy Technology Private Limited");
	  String subTitle = new String("Invoice");
	
	
	
	public void generarPDF(String invoiceTitle, String subTitle) {
		this.invoiceTitle = invoiceTitle;
		this.subTitle = subTitle;
		
		ProductName.add("Hola1");
		ProductName.add("Hola2");
		ProductName.add("Hola2");
		ProductPrice.add(1);
		ProductPrice.add(2);
		ProductPrice.add(3);
		ProductQty.add(1);
		ProductQty.add(2);
		ProductQty.add(3);
		
		PDDocument invc = new PDDocument();
		
		PDPage pagina = new PDPage();
		
		invc.addPage(pagina);
		
		
	    //get the page
	    PDPage mypage = invc.getPage(0);
	    try {
	      //Prepare Content Stream
	      PDPageContentStream cs = new PDPageContentStream(invc, mypage);
	      
	      //Writing Single Line text
	      //Writing the Invoice title
	      cs.beginText();
	      cs.setFont(PDType1Font.TIMES_ROMAN, 20);
	      cs.newLineAtOffset(140, 750);
	      cs.showText(invoiceTitle);
	      cs.endText();
	      
	      cs.beginText();
	      cs.setFont(PDType1Font.TIMES_ROMAN, 18);
	      cs.newLineAtOffset(270, 690);
	      cs.showText(subTitle);
	      cs.endText();
	      
	      //Writing Multiple Lines
	      //writing the customer details
	      cs.beginText();
	      cs.setFont(PDType1Font.TIMES_ROMAN, 14);
	      cs.setLeading(20f);
	      cs.newLineAtOffset(60, 610);
	      cs.showText("Customer Name: ");
	      cs.newLine();
	      cs.showText("Phone Number: ");
	      cs.endText();
	      
	      cs.beginText();
	      cs.setFont(PDType1Font.TIMES_ROMAN, 14);
	      cs.setLeading(20f);
	      cs.newLineAtOffset(170, 610);
	      cs.showText(CustName);
	      cs.newLine();
	      cs.showText(CustPh);
	      cs.endText();
	      
	      cs.beginText();
	      cs.setFont(PDType1Font.TIMES_ROMAN, 14);
	      cs.newLineAtOffset(80, 540);
	      cs.showText("Product Name");
	      cs.endText();
	      
	      cs.beginText();
	      cs.setFont(PDType1Font.TIMES_ROMAN, 14);
	      cs.newLineAtOffset(200, 540);
	      cs.showText("Unit Price");
	      cs.endText();
	      
	      cs.beginText();
	      cs.setFont(PDType1Font.TIMES_ROMAN, 14);
	      cs.newLineAtOffset(310, 540);
	      cs.showText("Quantity");
	      cs.endText();
	      
	      cs.beginText();
	      cs.setFont(PDType1Font.TIMES_ROMAN, 14);
	      cs.newLineAtOffset(410, 540);
	      cs.showText("Price");
	      cs.endText();
	      
	      cs.beginText();
	      cs.setFont(PDType1Font.TIMES_ROMAN, 12);
	      cs.setLeading(20f);
	      cs.newLineAtOffset(80, 520);
	      for(int i =0; i<n; i++) {
	        cs.showText(ProductName.get(i));
	        cs.newLine();
	      }
	      cs.endText();
	      
	      cs.beginText();
	      cs.setFont(PDType1Font.TIMES_ROMAN, 12);
	      cs.setLeading(20f);
	      cs.newLineAtOffset(200, 520);
	      for(int i =0; i<n; i++) {
	        cs.showText(ProductPrice.get(i).toString());
	        cs.newLine();
	      }
	      cs.endText();
	      
	      cs.beginText();
	      cs.setFont(PDType1Font.TIMES_ROMAN, 12);
	      cs.setLeading(20f);
	      cs.newLineAtOffset(310, 520);
	      for(int i =0; i<n; i++) {
	        cs.showText(ProductQty.get(i).toString());
	        cs.newLine();
	      }
	      cs.endText();
	      
	      cs.beginText();
	      cs.setFont(PDType1Font.TIMES_ROMAN, 12);
	      cs.setLeading(20f);
	      cs.newLineAtOffset(410, 520);
	      for(int i =0; i<n; i++) {
	        price = ProductPrice.get(i)*ProductQty.get(i);
	        cs.showText(price.toString());
	        cs.newLine();
	      }
	      cs.endText();
	      
	      cs.beginText();
	      cs.setFont(PDType1Font.TIMES_ROMAN, 14);
	      cs.newLineAtOffset(310, (500-(20*n)));
	      cs.showText("Total: ");
	      cs.endText();
	      
	      cs.beginText();
	      cs.setFont(PDType1Font.TIMES_ROMAN, 14);
	      //Calculating where total is to be written using number of products
	      cs.newLineAtOffset(410, (500-(20*n)));
	      cs.showText(total.toString());
	      cs.endText();
	      
	      //Close the content stream
	      cs.close();
	      //Save the PDF
	      invc.save(invoiceTitle +"-"+System.currentTimeMillis()+ ".pdf");
	      
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
	  

}
