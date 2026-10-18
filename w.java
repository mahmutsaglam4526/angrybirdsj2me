package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:w.class */
public final class w {
    private Object[] a = new Object[2];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f429a;
    private int b;

    public final void a(Object obj) {
        int r1;
        if (this.b >= this.a.length) {
            Object[] objArr = this.a;
            int r2 = this.b;
            int r3 = this.b;
            Object[] objArr2 = objArr;
            int length = objArr.length;
            int r13 = length;
            if (length < r2 + 1) {
                do {
                    r1 = r13 << 1;
                    r13 = r1;
                } while (r1 < r2 + 1);
                Object[] objArr3 = new Object[r13];
                az.a(objArr2, 0, objArr3, 0, r2);
                objArr2 = objArr3;
            }
            if (r3 < r2) {
                az.a(objArr2, r3, objArr2, r3 + 1, r2 - r3);
            }
            this.a = objArr2;
        }
        this.b++;
        Object[] objArr4 = this.a;
        int r4 = this.f429a;
        this.f429a = r4 + 1;
        objArr4[r4] = obj;
    }

    public final Object a() {
        if (this.b <= this.f429a) {
            return null;
        }
        Object[] objArr = this.a;
        int r2 = this.f429a;
        this.f429a = r2 + 1;
        return objArr[r2];
    }

    public final void a(int r5) {
        this.f429a -= r5;
    }
}
