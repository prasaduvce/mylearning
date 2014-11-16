package com.test.utils;

import org.apache.pdfbox.PDFMerger;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.util.PDFMergerUtility;
import org.springframework.util.ResourceUtils;

import java.io.IOException;

public class PdfUtils {
    public static void main(String[] args) {
        System.out.println("Entering PDF Validator ===> ");
        PdfUtils pdfUtils = new PdfUtils();
        PDDocument pdDocument = pdfUtils.getPdDocument("test.pdf");
        if (pdDocument != null) {
            pdfUtils.writeNewPdf(pdDocument);
        }
    }

    void writeNewPdf(PDDocument pdDocument) {
        PDDocument newPdDocument = new PDDocument();
        try {
            for (int i = 0; i < pdDocument.getNumberOfPages(); i++) {
                newPdDocument.importPage((PDPage) pdDocument.getDocumentCatalog().getAllPages().get(i));
                newPdDocument.save("newTest.pdf");
                newPdDocument.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (COSVisitorException e) {
            e.printStackTrace();
        }
    }

    PDDocument getPdDocument(String file) {
        PDDocument pdDocument = null;
        try {
             pdDocument = PDDocument.load(ResourceUtils.getFile(new PdfUtils().getClass().getResource("/"+file)));
        } catch (IOException e) {
            System.out.println("Exception while loading the resource file "+ file);
        }
        return pdDocument;
    }


    //TODO: Try using PdfMerge utility to copy the PDF.
    void writeNewPdfUsingMerger(PDDocument pdDocument) {
        PDFMergerUtility pdfMergerUtility = new PDFMergerUtility();
        try {
            //pdfMergerUtility.addSource(pdDocument.);
            PDFMerger.main(new String[]{"newTest1.pdf"});
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
