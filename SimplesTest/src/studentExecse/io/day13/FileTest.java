package studentExecse.io.day13;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * Created by Administrator on 2016/9/13.
 */
public class FileTest {
    private static Logger log = null;

    @Before
    public void getLogger() {
        log = Logger.getLogger(FileTest.class);

    }

    @Test
    public void geyFile() throws IOException {
        File file = new File("G:\\");
        // System.out.println(file.getName());
        //System.out.println(file.getAbsoluteFile());
        log.debug(file.getName());
        log.debug(file.getAbsoluteFile());
        log.debug(file.getParent());
        log.debug(file.lastModified());
        //File tmpFile=File.createTempFile("aaa",".txt",file);
        //tmpFile.deleteOnExit();
        //System.out.println(tmpFile.length());
        log.debug(file.createNewFile());
        File newFile = new File(System.currentTimeMillis() + "");
        log.debug(newFile.exists());
        String[] files = file.list();
        for (String s : files) {
            log.debug(s);
        }
        File[] roots = File.listRoots();
        //System.out.println(Arrays.asList(roots));
        for (File root : roots) {
            //System.out.println(root.getPath());
            if (root.getPath().equals("H:\\")) {
                return;
            }
            String[] files1 = root.list();

            for (String s : files1) {
                System.out.print(s + "\t");
            }
            System.out.println();

        }
    }

    @Test
    public void getFiles() throws IOException {
//        File file = new File(".");
//        System.out.println(file.getParent());
//        File file1 = new File(".");
//        String[] nameList = file1.list(((dir, name) -> name.endsWith(".java") || new File(name).isDirectory()));
//        for (String s : nameList) {
//            System.out.println(s);
//        }
//
////        System.out.println(System.getProperty("user.dir"));
////        System.out.println(ClassLoader.getSystemClassLoader().getResource("studentExecse.io.day13.FileTest"));
////        System.out.println();
////        int len = -1;
////        System.out.println();
//
//        System.out.println(this.getClass().getResource("../").getPath().substring(1));
//
//    File file2 = new File(FileTest.class.getResource("../").getPath().substring(1));
//    FilenameFilter filter = new FilenameFilter() {
//        @Override
//        public boolean accept(File dir, String name) {
//            //dir = file2;
//            if (name.endsWith(".class")) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }

//    String[] name = file2.list(new FilenameFilter() {
//        @Override
//        public boolean accept(File dir, String name) {
////            if (name.endsWith(".class")||new File(name).isDirectory()){
////                System.out.println("name : "+name);
////                return true;
////            }
//
//            System.out.println(new File(name).isDirectory()
//            );
//            return true;
//        }
//
//    });
//        for (String s : name) {
//            System.out.println("路径"+s);
//        }
        File file3=new File(FileTest.class.getResource("../").getPath().substring(1));
        file3.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                System.out.println(new File(name).isDirectory());
                return true;

            }
        });
        System.out.println(file3.isDirectory());
        System.out.println();
    }

}



