package defpackage;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ax.class */
public final class ax {
    private ft a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public m f89a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f90a;

    public ax() {
    }

    public static boolean a(int r6, bl blVar) {
        blVar.b = 0;
        blVar.f126a = blVar.a.length;
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("asema", true);
            byte[] record = recordStoreOpenRecordStore.getRecord(r6 + 1);
            if (record != null) {
                int length = record.length;
                blVar.c(blVar.b + length);
                az.a(record, 0, blVar.a, blVar.b, length);
                blVar.b += length;
            }
            recordStoreOpenRecordStore.closeRecordStore();
            blVar.m82a();
            return true;
        } catch (RecordStoreException unused) {
            return false;
        }
    }

    public static boolean b(int r6, bl blVar) {
        int r0 = blVar.a();
        byte[] bArr = new byte[r0];
        az.a(blVar.a, blVar.b, bArr, 0, r0);
        blVar.b += r0;
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("asema", true);
            int r7 = r6 + 1;
            while (recordStoreOpenRecordStore.getNextRecordID() <= r7) {
                recordStoreOpenRecordStore.addRecord((byte[]) null, 0, 0);
            }
            recordStoreOpenRecordStore.setRecord(r7, bArr, 0, r0);
            recordStoreOpenRecordStore.closeRecordStore();
            return true;
        } catch (RecordStoreException unused) {
            return false;
        }
    }

    public ax(ft ftVar) {
        this.f89a = new m();
        this.a = ftVar;
    }

    public final Object a() {
        Object objA = this.f89a.a();
        Object objA2 = objA;
        if (objA == null) {
            this.f90a++;
            objA2 = this.a.a();
        }
        return objA2;
    }
}
