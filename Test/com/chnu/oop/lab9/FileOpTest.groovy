package com.chnu.oop.lab9

class FileOpTest extends GroovyTestCase {

    void testCopyFile() {
        File file =new File(System.getProperty("user.dir"),"TextFile\\text.txt")
        FileOp fileOperation=new FileOp()
        fileOperation.copyFile(file)
        File pathFile=new File(file.getParent()+"/TextFile/",file.getName())
        assertEquals(true,pathFile.exists())
    }

}
