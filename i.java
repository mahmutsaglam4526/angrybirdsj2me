package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:i.class */
public final class i {
    public l a = new l();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public m f419a = new m();

    public final Object a(int r5) {
        int r0 = ab.a(r5, this.a.f421a, this.a.a);
        if (r0 < 0) {
            return null;
        }
        return this.f419a.f422a[r0];
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int r0 = this.a.a;
        if (r0 > 0) {
            for (int r7 = 0; r7 < r0; r7++) {
                stringBuffer.append(this.a.f421a[r7]);
                stringBuffer.append(':');
                stringBuffer.append(this.f419a.f422a[r7].toString());
                stringBuffer.append(',');
            }
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }
}
