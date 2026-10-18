package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:v.class */
public final class v {
    private Object[] a = {new int[1], new Object[8]};

    public final int a() {
        return ((int[]) this.a[0])[0];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final Object[] m198a() {
        return (Object[]) this.a[1];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m199a() {
        ((int[]) this.a[0])[0] = 0;
    }

    public final int a(Object obj) {
        if (a() == m198a().length) {
            Object[] objArr = new Object[a() << 1];
            az.a(m198a(), 0, objArr, 0, a());
            this.a[1] = objArr;
        }
        int r0 = a();
        m198a()[r0] = obj;
        int[] r1 = (int[]) this.a[0];
        r1[0] = r1[0] + 1;
        return r0;
    }

    public final Object a(int r4) {
        if (r4 < 0) {
            r4 = a() + r4;
        }
        return m198a()[r4];
    }
}
