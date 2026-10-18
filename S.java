package defpackage;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:S.class */
public class S extends MIDlet implements bc, Runnable {
    private static long a = Runtime.getRuntime().freeMemory();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static volatile boolean f0a;
    private static volatile boolean b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Thread f1a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int f2a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static int f3b;
    private boolean c;

    public S() {
        az.a = this;
    }

    protected synchronized void destroyApp(boolean z) {
        az.m67a();
        this.c = false;
        f1a = null;
        notify();
    }

    @Override // defpackage.bc
    public synchronized void pauseApp() {
        this.c = true;
        as.a(19);
    }

    @Override // defpackage.bc
    public synchronized void startApp() {
        this.c = false;
        if (f1a != null) {
            as.a(18);
            notify();
            return;
        }
        bd.a.a(this);
        Display display = Display.getDisplay(this);
        b = true;
        display.setCurrent(bd.a.a());
        Thread thread = new Thread(this);
        f1a = thread;
        thread.start();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02e8 A[Catch: all -> 0x0350, TryCatch #1 {, blocks: (B:24:0x006e, B:27:0x0077, B:29:0x007b, B:33:0x0092, B:35:0x009c, B:37:0x00af, B:39:0x00bb, B:41:0x00c5, B:43:0x00cf, B:45:0x00d9, B:46:0x00e8, B:115:0x0322, B:116:0x0329, B:118:0x032f, B:120:0x0336, B:123:0x033f, B:126:0x034c, B:47:0x00ef, B:49:0x00f9, B:51:0x0105, B:52:0x0114, B:54:0x011e, B:74:0x01e2, B:75:0x01fc, B:77:0x022c, B:79:0x0237, B:81:0x0240, B:57:0x0132, B:59:0x015a, B:70:0x01d2, B:62:0x0178, B:64:0x0185, B:66:0x0191, B:69:0x01a8, B:83:0x024a, B:85:0x0251, B:86:0x025b, B:89:0x0266, B:90:0x0283, B:92:0x028c, B:94:0x02ab, B:95:0x02b0, B:96:0x02b7, B:98:0x02c2, B:100:0x02ca, B:101:0x02da, B:111:0x0309, B:113:0x0319, B:104:0x02e8, B:107:0x02fb), top: B:156:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02fb A[Catch: all -> 0x0350, LOOP:5: B:90:0x0283->B:107:0x02fb, LOOP_END, TryCatch #1 {, blocks: (B:24:0x006e, B:27:0x0077, B:29:0x007b, B:33:0x0092, B:35:0x009c, B:37:0x00af, B:39:0x00bb, B:41:0x00c5, B:43:0x00cf, B:45:0x00d9, B:46:0x00e8, B:115:0x0322, B:116:0x0329, B:118:0x032f, B:120:0x0336, B:123:0x033f, B:126:0x034c, B:47:0x00ef, B:49:0x00f9, B:51:0x0105, B:52:0x0114, B:54:0x011e, B:74:0x01e2, B:75:0x01fc, B:77:0x022c, B:79:0x0237, B:81:0x0240, B:57:0x0132, B:59:0x015a, B:70:0x01d2, B:62:0x0178, B:64:0x0185, B:66:0x0191, B:69:0x01a8, B:83:0x024a, B:85:0x0251, B:86:0x025b, B:89:0x0266, B:90:0x0283, B:92:0x028c, B:94:0x02ab, B:95:0x02b0, B:96:0x02b7, B:98:0x02c2, B:100:0x02ca, B:101:0x02da, B:111:0x0309, B:113:0x0319, B:104:0x02e8, B:107:0x02fb), top: B:156:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0305  */
    /* JADX WARN: Code duplicated, block: B:111:0x0309 A[Catch: all -> 0x0350, TryCatch #1 {, blocks: (B:24:0x006e, B:27:0x0077, B:29:0x007b, B:33:0x0092, B:35:0x009c, B:37:0x00af, B:39:0x00bb, B:41:0x00c5, B:43:0x00cf, B:45:0x00d9, B:46:0x00e8, B:115:0x0322, B:116:0x0329, B:118:0x032f, B:120:0x0336, B:123:0x033f, B:126:0x034c, B:47:0x00ef, B:49:0x00f9, B:51:0x0105, B:52:0x0114, B:54:0x011e, B:74:0x01e2, B:75:0x01fc, B:77:0x022c, B:79:0x0237, B:81:0x0240, B:57:0x0132, B:59:0x015a, B:70:0x01d2, B:62:0x0178, B:64:0x0185, B:66:0x0191, B:69:0x01a8, B:83:0x024a, B:85:0x0251, B:86:0x025b, B:89:0x0266, B:90:0x0283, B:92:0x028c, B:94:0x02ab, B:95:0x02b0, B:96:0x02b7, B:98:0x02c2, B:100:0x02ca, B:101:0x02da, B:111:0x0309, B:113:0x0319, B:104:0x02e8, B:107:0x02fb), top: B:156:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0319 A[Catch: all -> 0x0350, TryCatch #1 {, blocks: (B:24:0x006e, B:27:0x0077, B:29:0x007b, B:33:0x0092, B:35:0x009c, B:37:0x00af, B:39:0x00bb, B:41:0x00c5, B:43:0x00cf, B:45:0x00d9, B:46:0x00e8, B:115:0x0322, B:116:0x0329, B:118:0x032f, B:120:0x0336, B:123:0x033f, B:126:0x034c, B:47:0x00ef, B:49:0x00f9, B:51:0x0105, B:52:0x0114, B:54:0x011e, B:74:0x01e2, B:75:0x01fc, B:77:0x022c, B:79:0x0237, B:81:0x0240, B:57:0x0132, B:59:0x015a, B:70:0x01d2, B:62:0x0178, B:64:0x0185, B:66:0x0191, B:69:0x01a8, B:83:0x024a, B:85:0x0251, B:86:0x025b, B:89:0x0266, B:90:0x0283, B:92:0x028c, B:94:0x02ab, B:95:0x02b0, B:96:0x02b7, B:98:0x02c2, B:100:0x02ca, B:101:0x02da, B:111:0x0309, B:113:0x0319, B:104:0x02e8, B:107:0x02fb), top: B:156:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0375  */
    /* JADX WARN: Code duplicated, block: B:144:0x0386  */
    /* JADX WARN: Code duplicated, block: B:145:0x038a  */
    /* JADX WARN: Code duplicated, block: B:147:0x038e  */
    /* JADX WARN: Code duplicated, block: B:149:0x039f  */
    /* JADX WARN: Code duplicated, block: B:150:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:188:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0301 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0266 A[Catch: all -> 0x0350, TryCatch #1 {, blocks: (B:24:0x006e, B:27:0x0077, B:29:0x007b, B:33:0x0092, B:35:0x009c, B:37:0x00af, B:39:0x00bb, B:41:0x00c5, B:43:0x00cf, B:45:0x00d9, B:46:0x00e8, B:115:0x0322, B:116:0x0329, B:118:0x032f, B:120:0x0336, B:123:0x033f, B:126:0x034c, B:47:0x00ef, B:49:0x00f9, B:51:0x0105, B:52:0x0114, B:54:0x011e, B:74:0x01e2, B:75:0x01fc, B:77:0x022c, B:79:0x0237, B:81:0x0240, B:57:0x0132, B:59:0x015a, B:70:0x01d2, B:62:0x0178, B:64:0x0185, B:66:0x0191, B:69:0x01a8, B:83:0x024a, B:85:0x0251, B:86:0x025b, B:89:0x0266, B:90:0x0283, B:92:0x028c, B:94:0x02ab, B:95:0x02b0, B:96:0x02b7, B:98:0x02c2, B:100:0x02ca, B:101:0x02da, B:111:0x0309, B:113:0x0319, B:104:0x02e8, B:107:0x02fb), top: B:156:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:92:0x028c A[Catch: all -> 0x0350, TryCatch #1 {, blocks: (B:24:0x006e, B:27:0x0077, B:29:0x007b, B:33:0x0092, B:35:0x009c, B:37:0x00af, B:39:0x00bb, B:41:0x00c5, B:43:0x00cf, B:45:0x00d9, B:46:0x00e8, B:115:0x0322, B:116:0x0329, B:118:0x032f, B:120:0x0336, B:123:0x033f, B:126:0x034c, B:47:0x00ef, B:49:0x00f9, B:51:0x0105, B:52:0x0114, B:54:0x011e, B:74:0x01e2, B:75:0x01fc, B:77:0x022c, B:79:0x0237, B:81:0x0240, B:57:0x0132, B:59:0x015a, B:70:0x01d2, B:62:0x0178, B:64:0x0185, B:66:0x0191, B:69:0x01a8, B:83:0x024a, B:85:0x0251, B:86:0x025b, B:89:0x0266, B:90:0x0283, B:92:0x028c, B:94:0x02ab, B:95:0x02b0, B:96:0x02b7, B:98:0x02c2, B:100:0x02ca, B:101:0x02da, B:111:0x0309, B:113:0x0319, B:104:0x02e8, B:107:0x02fb), top: B:156:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02ab A[Catch: all -> 0x0350, TryCatch #1 {, blocks: (B:24:0x006e, B:27:0x0077, B:29:0x007b, B:33:0x0092, B:35:0x009c, B:37:0x00af, B:39:0x00bb, B:41:0x00c5, B:43:0x00cf, B:45:0x00d9, B:46:0x00e8, B:115:0x0322, B:116:0x0329, B:118:0x032f, B:120:0x0336, B:123:0x033f, B:126:0x034c, B:47:0x00ef, B:49:0x00f9, B:51:0x0105, B:52:0x0114, B:54:0x011e, B:74:0x01e2, B:75:0x01fc, B:77:0x022c, B:79:0x0237, B:81:0x0240, B:57:0x0132, B:59:0x015a, B:70:0x01d2, B:62:0x0178, B:64:0x0185, B:66:0x0191, B:69:0x01a8, B:83:0x024a, B:85:0x0251, B:86:0x025b, B:89:0x0266, B:90:0x0283, B:92:0x028c, B:94:0x02ab, B:95:0x02b0, B:96:0x02b7, B:98:0x02c2, B:100:0x02ca, B:101:0x02da, B:111:0x0309, B:113:0x0319, B:104:0x02e8, B:107:0x02fb), top: B:156:0x006e }] */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0358, code lost:
    
        if (r9 == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x035e, code lost:
    
        if (defpackage.au.m52b() == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0361, code lost:
    
        defpackage.bd.a.mo34a();
        defpackage.au.m53d();
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instruction units count: 953
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S.run():void");
    }

    @Override // defpackage.bc
    public final synchronized void a(Graphics graphics) {
        if (az.f95a) {
            return;
        }
        int width = bd.a.getWidth();
        int height = bd.a.getHeight();
        au.a(graphics, width, height);
        if (width <= 0 || height <= 0) {
            return;
        }
        if (f0a) {
            if (width != f2a || height != f3b) {
                f2a = width;
                f3b = height;
                as.a(81);
            }
            aq aqVar = ba.a;
            if (aqVar.f65a) {
                int r1 = aqVar.f62a.f417a;
                int r2 = aqVar.f62a.f418b;
                aqVar.c();
            } else {
                aqVar.m33a().d();
            }
        }
        b = false;
    }
}
