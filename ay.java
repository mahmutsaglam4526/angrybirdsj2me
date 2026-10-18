package defpackage;

import java.io.IOException;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ay.class */
public final class ay {
    private static int a = -1;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f91a = new int[8];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Player[] f92a = new Player[8];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean[] f93a = new boolean[8];
    private static int[] b = new int[8];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static boolean[] f94b = new boolean[8];
    private static int[] c;

    public static int a() {
        for (int r4 = 0; r4 < 8; r4++) {
            if (f91a[r4] == 0) {
                f91a[r4] = a;
                f93a[r4] = false;
                return r4;
            }
        }
        return -1;
    }

    public static void a(int r4) {
        c(r4);
        if (f91a[r4] != 0 && f92a[r4] != null) {
            f92a[r4].close();
        }
        f91a[r4] = 0;
        f92a[r4] = null;
        f94b[r4] = false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    public static void a(int r5, int r6) {
        String str;
        c(r5);
        f91a[r5] = a;
        InputStream inputStreamM59a = av.m59a(3, r6);
        if (inputStreamM59a == null) {
            return;
        }
        try {
            if (f92a[r5] != null) {
                f92a[r5].close();
                f92a[r5] = null;
            }
            if (c == null) {
                c = av.m57a(1);
            }
            switch (c[r6] & 15) {
                case 1:
                    str = "audio/midi";
                    break;
                case 2:
                    str = "audio/x-wav";
                    break;
                case 3:
                    str = "audio/mpeg";
                    break;
                case 4:
                    str = "audio/mp4";
                    break;
                case 5:
                    str = "audio/ogg";
                    break;
                default:
                    str = null;
                    break;
            }
            f92a[r5] = Manager.createPlayer(inputStreamM59a, str);
            f92a[r5].prefetch();
            f94b[r5] = false;
            f91a[r5] = r6;
        } catch (MediaException unused) {
            if (f92a[r5] != null) {
                f92a[r5].close();
                f92a[r5] = null;
            }
        } catch (IOException unused2) {
            if (f92a[r5] != null) {
                f92a[r5].close();
                f92a[r5] = null;
            }
        }
    }

    public static void b(int r4) {
        VolumeControl control;
        if (f92a[r4] != null) {
            c(r4);
            try {
                f92a[r4].setLoopCount(f93a[r4] ? -1 : 1);
                if (f91a[r4] > 0 && f92a[r4] != null && f92a[r4].getState() != 100 && (control = f92a[r4].getControl("VolumeControl")) != null) {
                    control.setLevel((b[r4] * 100) / 65536);
                }
                f92a[r4].start();
                f94b[r4] = true;
            } catch (MediaException unused) {
                f92a[r4] = null;
            }
        }
    }

    public static void c(int r4) {
        if (f92a[r4] == null || f92a[r4].getState() != 400) {
            return;
        }
        try {
            f92a[r4].stop();
        } catch (MediaException unused) {
            f92a[r4] = null;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m64a(int r3) {
        return (f92a[r3] == null || !f94b[r3] || f92a[r3].getState() == 300) ? false : true;
    }

    public static void d(int r4) {
        if (r4 < 0 || r4 >= 8) {
            return;
        }
        f93a[r4] = true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    protected static void m65a() {
    }

    protected static void b() {
    }

    static {
        ab.a(b, 65536);
    }
}
