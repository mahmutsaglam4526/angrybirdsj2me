package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ai.class */
public final class ai {
    private static String a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f21a = false;

    public static String a(String str) {
        if (!f21a) {
            f21a = true;
            a = "%0U";
        }
        StringBuffer stringBuffer = new StringBuffer(av.m55a(2));
        aj.a(stringBuffer, a, str);
        return stringBuffer.toString();
    }
}
