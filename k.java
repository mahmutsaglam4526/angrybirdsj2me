package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:k.class */
public final class k {
    public m a = new m();
    public m b = new m();

    public final Object a(int r4) {
        return this.b.f422a[r4];
    }

    public final Object a(String str) {
        int r0 = ab.a(str, this.a.f422a, this.a.a);
        if (r0 < 0) {
            return null;
        }
        return this.b.f422a[r0];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final String m192a(int r4) {
        return (String) this.a.f422a[r4];
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int r0 = this.a.a;
        if (r0 > 0) {
            for (int r7 = 0; r7 < r0; r7++) {
                stringBuffer.append(m192a(r7));
                stringBuffer.append(':');
                Object objA = a(r7);
                Object obj = objA;
                if (objA instanceof k) {
                    obj = "[MapSO]";
                }
                stringBuffer.append(obj.toString());
                stringBuffer.append(',');
            }
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }
}
