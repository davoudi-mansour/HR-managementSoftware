import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

public class HeaderFooterPageEvent extends PdfPageEventHelper {

    public void onStartPage(PdfWriter writer, Document document) {
       // ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase(testj"), 30, 800, 0);
      //  ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("گزارش مالی"), 550, 800, 0);
    }

    public void onEndPage(PdfWriter writer, Document document) {
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("http://nezamkardani.com/"), 110, 30, 0);
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("page " + document.getPageNumber()), 550, 30, 0);
    }

}